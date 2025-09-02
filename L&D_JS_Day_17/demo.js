const Student={
    name:"Xabi Alonso",
    greeting:function(){
        console.log(`Welcome ${this.name}".`);

    }

};
// setTimeout(function(){
// Student.greeting()
// },2000);

//setTimeout(()=>Student.greeting(),2000);

let greet=Student.greeting.bind(Student);
setTimeout(greet,2000);