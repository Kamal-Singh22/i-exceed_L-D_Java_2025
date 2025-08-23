const bankAccount={
    balance:1,
    deposit:function(amount)
    {
        this.balance+=amount;
    },
    withdraw:function(amount)
    {
       if (amount > this.balance) {
            console.log("Insufficient balance.");
        } else {
            this.balance -= amount;
            console.log("Withdrawal successful.");
        }

    },
    getAmt:function()
    {
        return this.balance
    }
}


let businessbankaccount=Object.create(bankAccount,
    {
        accno:{value:"bballb",configurable:true,writable:true,enumerable:true},
        holder:{value:"Hasaranga",writable:false,configurable:true,enumerable:true},
        balance:{value:1,writable:true}
    });
businessbankaccount.holder="abcd";
console.log(businessbankaccount.holder);
console.log(businessbankaccount.balance);
businessbankaccount.deposit(200000);
console.log(businessbankaccount.balance);
businessbankaccount.withdraw(500001);
console.log(businessbankaccount.balance);
 