const target = { a: 1 };
const source = { b: 2 };
const destination={c:3};
const result = Object.assign(target, source,destination);
console.log(result);




const proto = { greet() 
{
    console.log("Hello"); 
}
};
const obj = Object.create(proto);
obj.greet();



