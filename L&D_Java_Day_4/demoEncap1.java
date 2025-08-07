class student 

  {

     private String name,dept;

     private int roll;
 
      student(String name,int roll,String dept)

	{

	   this.name=name;

	   this.roll=roll;

	   this.dept=dept;

	}

     public void  getroll()

	{

	  System.out.println("Roll no is: "+roll);

	}
 
      public void  getname()   //write only

	{

	  System.out.println("Name is: "+name);

	}

      public void  getdept()

	{

	  System.out.println("Department is: "+dept);

	}
 
      public void setRoll(int roll)

	{

	  this.roll=roll;

	}

      public void setName(String name)

	{

	  this.name=name;

	}

      public void setDept(String dept)

	{

	  this.dept=dept;

	}

   }
class demoEncap1

{

    public static void main(String asdd[])

	{

	   student s1=new student("Jay Prakash",1,"CSE");
       s1.getname();
       s1.getroll();
       s1.getdept();

 
	}

}
 
	
 
 
 