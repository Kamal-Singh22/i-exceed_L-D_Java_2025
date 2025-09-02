let parent={
    name:'Mbappe',
    calculateAge:function(dob)
{
    this.dob=dob;
    console.log(new Date().getFullYear()-this.dob);
},
qualification:'B.Tech',
};
let child={
    name:'Jude',
    __proto__:parent,
};
let quali={
    __proto__:child,
}
    child.calculateAge(2001);
    console.log(quali.qualification);
