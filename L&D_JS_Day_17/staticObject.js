// Object.assign()
const target = { a: 1 };
const source = { b: 2 };
const result = Object.assign(target, source);

// Object.create()
const proto = { greet() { return "Hello"; } };
const obj = Object.create(proto);
obj.greet(); 

// Object.defineProperty()
const person = {};
Object.defineProperty(person, 'name', {
  value: 'Kamal',
  writable: false,
  enumerable: true,
  configurable: true
});

// Object.defineProperties()
const car = {};
Object.defineProperties(car, {
  make: { value: 'Toyota', enumerable: true },
  model: { value: 'Corolla', enumerable: true }
});

// Object.entries()
const user = { name: 'Kamal', age: 25 };
Object.entries(user);

// Object.fromEntries()
const entries = [['name', 'Kamal'], ['age', 25]];
Object.fromEntries(entries);

// Object.freeze()
const config = { debug: true };
Object.freeze(config);
config.debug = false; 

// Object.getOwnPropertyDescriptor()
Object.getOwnPropertyDescriptor(person, 'name');

// Object.getOwnPropertyDescriptors()
Object.getOwnPropertyDescriptors(car);

// Object.getOwnPropertyNames()
Object.getOwnPropertyNames(car);

// Object.getOwnPropertySymbols()
const sym = Symbol('id');
const objWithSymbol = { [sym]: 123 };
Object.getOwnPropertySymbols(objWithSymbol);

// Object.getPrototypeOf()
Object.getPrototypeOf(obj);

// Object.hasOwn()
Object.hasOwn(user, 'name');

// Object.is()
Object.is(NaN, NaN);
Object.is(0, -0); 

// Object.isExtensible()
Object.isExtensible(user); 

// Object.isFrozen()
Object.isFrozen(config); 

// Object.isSealed()
Object.isSealed(config); 
// Object.keys()
Object.keys(user); 

// Object.preventExtensions()
Object.preventExtensions(user);
user.newProp = 'test'; 

// Object.seal()
Object.seal(user);
delete user.name; 

// Object.setPrototypeOf()
Object.setPrototypeOf(user, proto);

// Object.values()
Object.values(user);
