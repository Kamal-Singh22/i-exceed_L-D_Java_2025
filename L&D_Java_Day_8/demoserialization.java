import java.io.*;
class Employee   implements Serializable 
{
    String emp_name,design;
    int emp_code;
    double salary;

    Employee(String emp_name,String design,int emp_code,double salary){
    this.emp_name=emp_name;
    this.design=design;
    this.emp_code=emp_code;
    this.salary=salary;


}
}
class demoserialization
{
    public static void main(String asd[]) throws Exception
	{
	   Employee e1=new Employee("A","qwe",1,120000);
	   ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("mydataa.txt")));
	   os.writeObject(e1);
 
	   ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("mydataa.txt")));
	   Employee e=(Employee)oi.readObject();
	   System.out.println("Name of the employee: "+e.emp_name);
	   System.out.println("Employee code: "+e.emp_code);
	   System.out.println("Designation: "+e.design);
	   System.out.println("Salary: "+e.salary);
 
 
	}
}