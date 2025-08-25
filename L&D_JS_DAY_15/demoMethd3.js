const obj = Object.create({}, 
{
  hidden: 
  { 
    value: 'secret', enumerable: false 

    }
});
console.log(Object.getOwnPropertyNames(obj));


const sym = Symbol('id');
const obj1 = { [sym]: 123 };
console.log(Object.getOwnPropertySymbols(obj1));


const obj2 = {};
console.log(Object.getPrototypeOf(obj2));


const obj3 = { a: 1 };
console.log(Object.hasOwn(obj3, 'a')); 




console.log(Object.is(NaN, NaN));
console.log(Object.is(-0, +0)); 



const obj4 = {};
console.log(Object.isExtensible(obj));
