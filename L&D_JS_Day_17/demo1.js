function outer()
 {
    let count=0;
 
    return function()
    {
        count++;
        return count;
    }
 
 }
 
 const counter1=outer();
 
 console.log(counter1());
 console.log(counter1());





 function outer1()
{
   let count=0;
   function inner()
   {
       count++;
       return count;
   }
   return inner();
};
 
console.log(outer1());
console.log(outer1());