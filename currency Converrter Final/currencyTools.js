// currencyTools.js
export function createCurrencyTools({
  apiKey = "",
  baseUrl = "https://api.fastforex.io",
  useMock = false,
  mockRates = { USD: 1, INR: 82, EUR: 0.92, GBP: 0.78, NPR: 130 },
  pollInterval = 15000,
  initialWallet = { USD: 500, INR: 20000, NPR: 10000, EUR: 300, GBP: 150 },
} = {}) {
  // internal state
  let rates = {};
  let currencies = {};
  let wallet = { ...initialWallet };
  let activeAlerts = new Set();
  let usingMock = useMock;

  function _activateMock(reason = "Unknown") {
    console.warn("⚠️ Falling back to mock data. Reason:", reason);
    rates = { ...mockRates };
    currencies = Object.fromEntries(Object.keys(mockRates).map(k => [k, k]));
    usingMock = true;
    return { rates, currencies };
  }

  // ---- loadCurrencies
  function loadCurrencies(callback) {
    if (usingMock) {
      setTimeout(() => callback(null, { rates, currencies }), 0);
      return () => {};
    }

    const controller = new AbortController();
    const signal = controller.signal;

    (async () => {
      try {
        const res = await fetch(`${baseUrl}/fetch-all?api_key=${apiKey}`, { signal });
        const data = await res.json();
        if (!data?.results || Object.keys(data.results).length === 0) {
          return callback(null, _activateMock("No results from API"));
        }
        rates = data.results;

        const curRes = await fetch(`${baseUrl}/currencies?api_key=${apiKey}`, { signal });
        const curData = await curRes.json();
        if (!curData?.currencies) {
          return callback(null, _activateMock("No currencies from API"));
        }
        currencies = curData.currencies;

        callback(null, { rates, currencies });
      } catch (err) {
        callback(null, _activateMock(err.message));
      }
    })();

    return () => controller.abort();
  }
  function loadCurrenciesPromise() {
    return new Promise((res, rej) => {
      loadCurrencies((err, data) => (err ? rej(err) : res(data)));
    });
  }

  // ---- convertCurrency
  function convertCurrency(amount, from, to, callback) {
    setTimeout(() => {
      if (typeof amount !== "number" || Number.isNaN(amount)) return callback(new Error("Invalid amount"));
      if (!rates[from] || !rates[to]) return callback(new Error("Rate not available for currency"));

      const rate = rates[to] / rates[from];
      const converted = amount * rate;

      callback(null, { amount, from, to, rate, converted });
    }, 0);
  }
  function convertCurrencyPromise(amount, from, to) {
    return new Promise((res, rej) => convertCurrency(amount, from, to, (e, v) => (e ? rej(e) : res(v))));
  }

  // ---- Wallet
  function getWallet(cb) {
    setTimeout(() => cb(null, { ...wallet }), 0);
  }
  function deposit(currency, amount, cb) {
    if (amount <= 0) return cb(new Error("Invalid amount"));
    wallet[currency] = (wallet[currency] || 0) + amount;
    cb(null, { ...wallet });
  }
  function withdraw(currency, amount, cb) {
    if (amount <= 0) return cb(new Error("Invalid amount"));
    if (!wallet[currency] || wallet[currency] < amount) return cb(new Error("Insufficient balance"));
    wallet[currency] -= amount;
    cb(null, { ...wallet });
  }
  function transfer(fromCur, toCur, amount, cb) {
    if (amount <= 0) return cb(new Error("Invalid amount"));
    if (!wallet[fromCur] || wallet[fromCur] < amount) return cb(new Error("Insufficient balance"));
    if (!rates[fromCur] || !rates[toCur]) return cb(new Error("Rates not available"));

    const conversionRate = rates[toCur] / rates[fromCur];
    const gross = amount * conversionRate;
    const fee = 5 + 0.02 * gross;
    const net = gross - fee;

    wallet[fromCur] -= amount;
    wallet[toCur] = (wallet[toCur] || 0) + net;

    cb(null, { fromCur, toCur, amount, gross, fee, net, wallet: { ...wallet } });
  }

    // ---- 14-Day Historical Rates
  function get14DayRates(base, target, callback) {
    if (usingMock) {
      // generate fake 14 days of data
      const today = new Date();
      const arr = [];
      const baseRate = rates[target] / rates[base];
      for (let i = 13; i >= 0; i--) {
        const d = new Date(today);
        d.setDate(today.getDate() - i);
        const jitter = 1 + (Math.random() - 0.5) * 0.02; // ±2% variation
        arr.push({ date: d.toISOString().split("T")[0], rate: +(baseRate * jitter).toFixed(4) });
      }
      return callback(null, arr);
    }

    (async () => {
      try {
        const today = new Date();
        const requests = [];
        for (let i = 0; i < 14; i++) {
          const d = new Date(today);
          d.setDate(today.getDate() - i);
          const dateStr = d.toISOString().split("T")[0];
          const url = `${baseUrl}/historical?date=${dateStr}&from=${base}&to=${target}&api_key=${apiKey}`;
          requests.push(
            fetch(url)
              .then(r => r.json())
              .then(js => ({ date: dateStr, rate: js?.results?.[target] ?? null }))
              .catch(() => ({ date: dateStr, rate: null }))
          );
        }
        const results = await Promise.all(requests);
        const filtered = results.filter(r => r.rate !== null);
        filtered.sort((a, b) => a.date.localeCompare(b.date));
        if (filtered.length === 0) return callback(new Error("No data available"));
        callback(null, filtered);
      } catch (err) {
        callback(err);
      }
    })();
  }

  function get14DayRatesPromise(base, target) {
    return new Promise((resolve, reject) => {
      get14DayRates(base, target, (err, data) => (err ? reject(err) : resolve(data)));
    });
  }


  // ---- Alerts
  function setRateAlert(from, to, targetRate, onTriggered, { interval = pollInterval } = {}) {
    const id = setInterval(() => {
      const liveRate = (rates[to] || 0) / (rates[from] || 1);
      if (liveRate >= targetRate) {
        onTriggered(null, { from, to, rate: liveRate });
        clearInterval(id);
        activeAlerts.delete(id);
      }
    }, interval);
    activeAlerts.add(id);
    return { stop: () => { clearInterval(id); activeAlerts.delete(id); } };
  }

  return {
    loadCurrencies, loadCurrenciesPromise,
    convertCurrency, convertCurrencyPromise,
    getWallet, deposit, withdraw, transfer,
    get14DayRates, get14DayRatesPromise,
    setRateAlert,
    _getState: () => ({ rates, currencies, wallet, usingMock }),
  };

}
