"use strict";

let age=34;
let greeting;
if(age<18)
    {
        greeting=function()
        {
    
            console.log("you are too young to get the DL.");
        };
    }
else
{
    greeting=function()
    {
        console.log("you are eligible for DL.");
    };
}

greeting();