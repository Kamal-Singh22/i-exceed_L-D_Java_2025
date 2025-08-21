const employee={e_name:"Rajesh",Age:33,City:'Bangaluru',e_id:112}
console.log(employee);

const employe1=new Object();
employe1.e_name="Rahul";
employe1.Age=22;
employe1.City="Delhi";
employe1.e_id=11123;
console.log(employe1);

const person = {
  firstName: "Harry",
  lastName: "Carry",
  age: 50,
  eyeColor: "blue"
};
console.log(person)

const student=({
    S_name:"lama",
    L_name:"Dai",
    Age:32,
    Dept:"AIML",
    University:"MIT",

});
console.log(student);


const person1=({
    f_name:"John",
    l_name:"Laha",
    Age:32,
    City:"Pokhara",
});
const man=Object.create(person1);
    man.name="Kp";
    man.age=44;
    man.city="Chitwan";
console.log(man);