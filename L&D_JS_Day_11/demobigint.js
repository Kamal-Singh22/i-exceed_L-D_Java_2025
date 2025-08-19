let x=999999999999999;
let y=99999999999999999n;
console.log(x);
console.log(typeof(x));
console.log(y);
console.log(typeof(y));

let a=1234567654321234567654321n;
let b=BigInt(123456765432123456765432123456765432);
console.log(typeof (a));
console.log(typeof(b))
let mul=a*b;
console.log("The product of the: "+mul);

// let p=5n;
// let q=p/2;
// console.log(q);

let p=5n;
let q=Number(p)/2;
console.log(q);