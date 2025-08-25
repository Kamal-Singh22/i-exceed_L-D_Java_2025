const obj = { a: 1, b: 2 };
console.log(Object.entries(obj));


const entries = [['a', 1], ['b', 2]];
console.log(Object.fromEntries(entries));


const obj1 = { a: 1 };
Object.freeze(obj1);
obj1.a = 2; 
console.log(obj1.a);

const obj2 = { a: 1 };
console.log(Object.getOwnPropertyDescriptor(obj2, 'a'));


const obj3 = { a: 1, b: 2 };
console.log(Object.getOwnPropertyDescriptors(obj3));
