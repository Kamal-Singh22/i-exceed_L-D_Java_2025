function display()
{
    let state=["Andhra","Tamilnadu","Karnataka","Kerala"]
    for(i in state)
    {
        if(state[i]=="Karnataka")
        {
            console.log(`${state[i]} is commercial capital of India`);
        }
           
    }
}
 
setTimeout(display,2000);


//setTimeOut with parameters
 

function display1(...args)
{
    for(i in args)
    {
        if(args[i]=="Karnataka")
        {
            console.log(`${args[i]} is commercial capital of India`);
        }
           
    }
}
 
setTimeout(display1,2000,"Andhra","Tamilnadu","Karnataka","Kerala")



//
function display2()
{
  let states=["Andhra","Tamilnadu","Karnataka","Kerala"];  
 
    for(i in states)
    {
        if(states[i]=="Karnataka")
        {
            console.log(`${states[i]} is commercial capital of India`);
        }
           
    }
}
 
setTimeout(display2,4000,)

//
function display3(...args)
{
 
    for(i in args)
    {
        if(args[i]=="Karnataka")
        {
            console.log(`${args[i]} is commercial capital of India`);
        }
           
    }
}
 
setTimeout(display3,4000,"Andhra","Tamilnadu","Karnataka","Kerala")
 


// JSON

let user={name:"Dharshan",
    age:22,
    isEng:true,
    course:["java","dart","flutter"],
   
};
// console.log(user.name);
 
let jsonuser=JSON.stringify(user);
console.log(jsonuser);
console.log(typeof jsonuser);
 
userobject=JSON.parse(jsonuser);
console.log(typeof userobject);