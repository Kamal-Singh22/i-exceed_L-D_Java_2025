// let age=77;
// if(age<=18){
//     console.log("You are not eligible for vote.");

// }else
// {
//     console.log("You are ready forvote.")
// }

let marks=43;
if(marks<40)
{
    console.log("Re appear");
}
else if(marks>40 && marks<60)
{
    console.log("Pass");
}
else if(marks>60 && marks<80)
{
    console.log("A grade");
}
else if(marks>80 && marks<=100)
{
    console.log("A++ grade");
}
else{
    console.log("Enter the proper marks");
}
 
// let res=marks<40 ? "re-appear" : marks>40&& marks<60 ? "Pass" : marks>60 && marks<80 ? "A grade" : marks>80 && marks<=100?"A++ grade":"Enter proper marks";
//console.log(res);

let res=marks<40 ? "re-appear" : marks>40&& marks<60 ? "Pass" : marks>60 && marks<80 ? "A grade" : marks>80 && marks<=100?"A++ grade":"Enter proper marks";