let trainee={name:"rakesh"};
 
let trainer={
    name:"sivam",
    displayName:function()
    {
        return this.name;
    },
    calculateMyAge:function(dob)
    {
        this.dob=dob;
        return new Date().getFullYear()-this.dob
 
    }
 
};
console.log(trainer.displayName());
console.log(trainer.displayName.bind(trainee)());
console.log(trainer.calculateMyAge(1941));
let trainee_age=trainer.calculateMyAge.bind(trainee);
console.log(trainee_age(2023));