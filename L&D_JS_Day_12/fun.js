let getData=(x,y)=>x+y;
console.log(getData(10,65));
 
let getMe=(x)=>x.toUpperCase();
console.log(getMe("rakesh"))
 
 
   
  console.log(getData(10,43));
 
  let getMyMail=(f_name,age,city)=>f_name+age+city+"@"+"gmail.com";
  console.log(getMyMail("Yabi",23,"Kathmandu"));


//   Array function which takes string trim whitespace and uppercase.


const myFunction=(arr)=>arr.map(str=>str.trim().toUpperCase());
let input = ["  hello  ", " world ", " JavaScript "];
console.log(myFunction(input));

