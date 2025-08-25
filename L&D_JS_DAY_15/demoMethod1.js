const obj = {};
Object.defineProperty(obj, 'name', {
  value: 'Ritesh',
  writable: false
});
console.log(obj.name); 
obj.name = 'Yadav'; 
console.log(obj.name); 



const obj = {};
Object.defineProperties(obj, {
  name: { value: 'Kabir', writable: true },
  age: { value: 25, writable: false }
});
console.log(obj.name);

 
