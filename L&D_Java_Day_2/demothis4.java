class student 

{

    String name,dept,college;

    int age;
 
     student(String name,int age,String dept)

	{

	  this.name=name;

	  this.age=age;

	  this.dept=dept;

	}
 
    student(String name,int age,String dept,String college)

	{

		this(name,age,dept);

		this.college=college;

	        System.out.println(college);

	 	this.displayStudent();

	}
 
	public void displayStudent()

	{

	   System.out.println("Hi" +name +"you are " +age+" belongs to "+dept+" from"+college);

	}
 
  }
 
class demothis4

{

    public static void main(String asd[])

	{

	   student obj=new student(" Avaya ",32," CSE "," Jain University ");

	}

  }
 