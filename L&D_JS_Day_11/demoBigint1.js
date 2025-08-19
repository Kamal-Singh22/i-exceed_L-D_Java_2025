let hex = 0x20000000000003n;
let oct = 0o400000000000000003n;
let bin = 0b100000000000000000000000000000000000000000000000000011n;
console.log(hex);
console.log(typeof(hex));
console.log(oct);
console.log(typeof(oct));
console.log(bin);
console.log(typeof(bin));

const a=9007199254740992 == 9007199254740993;
console.log(a);

let k=Number.MAX_SAFE_INTEGER;
let p=Number.MIN_SAFE_INTEGER;
console.log(k);
console.log(typeof(k))
console.log(p);


console.log(Number.isInteger(10));
console.log(Number.isInteger(10.5));
//console.log(x)
//console.log(y);

console.log(Number.isSafeInteger(10));
console.log(Number.isSafeInteger(12345678901234567890));

