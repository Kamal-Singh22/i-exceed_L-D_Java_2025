class Person
{
    String Name,Address,Dept;
    int Age, PhoneNumber;

    Person(String Name, String Address, String Dept,int Age, int PhoneNumber) {
        this.Name=Name;
        this.Address=Address;
        this.Dept=Dept;
        this.Age=Age;
        this.PhoneNumber=PhoneNumber;
    }
    public void displayDetails()
    {
        System.out.println("Name of the Person: "+Name);
        System.out.println("Address of the Person is: "+Address);
        System.out.println("Department of the Person: "+Dept);
        System.out.println("Age of the Personis: "+Age);
        System.out.println("Number of the Person is: "+PhoneNumber);
    }

    

}
class Students extends Person
{
int Semester,ID;

Students(String Name, String Address, String Dept,int Age, int PhoneNumber, int Semester,int ID) {
super(Name,Address,Dept,Age,PhoneNumber);
this.Semester=Semester;
this.ID=ID;
    }
    public void displayStudentDetails()
    {
        displayDetails();
        System.out.println("Semester of the Student: "+Semester);
        System.out.println("ID Number of the Student: "+ID);
    }
    


}

class Teacher extends  Person{
String Subject;
double Salary;

Teacher(String Name, String Address, String Dept,int Age,int PhoneNumber,String Subject, double Salary) {
        super(Name, Address,Dept,Age,PhoneNumber);
        this.Subject=Subject;
        this.Salary=Salary;
    }
    public void displayTeacherDetails(){
        displayDetails();
        System.out.println("Subject Of the Teacher: "+Subject);
        System.out.println("Salary of the teacher: "+Salary);

    }


}
public class CollegeManagement {
    public static void main(String[] args) {
        
   
    Students st=new Students("Hari", "Delhi", "CSE", 20, 1234567890, 4, 0112);
    st.displayStudentDetails();
    Teacher tr=new Teacher("ShivKumar","Bangalur", "DS", 34, 1234567890, "DSA", 500000);
    tr.displayTeacherDetails();
}
}
