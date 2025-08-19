let s1='qwerty';
let s2='qwerty';
console.log(s1);
console.log(s2);
console.log(typeof(s1));

let str=new String("Hello welcome to the i-exceed.");
console.log(str);

let str1='Java Script, ';
let str2=`You are learning ${str1}`
console.log(str2);

let str3=`this is 
a multiline 
String in js.`;
console.log(str3);

console.log(str3.length);   // Length of the String.


console.log(str1+str2+str3);

let str4="Welcome to the i-exceed";
let str5=str4.substring(0, 7);
console.log(str5);

console.log(str4.toUpperCase());
console.log(str4.toLowerCase());

let str6=str4.indexOf('to');
console.log(str6);


let s11=new String("Hello");
let s12="Hello";
console.log(s11==s12);
console.log(s11===s12);


"12345">23456;