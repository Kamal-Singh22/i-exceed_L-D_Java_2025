class student
 {
    student()
    {
      this(10,12);
      System.out.println("object in subclass"+this);
    }
 
    public void display()
    {
        System.out.println("Display");
    }
 
    student(int x,int y)
    {
        System.out.println(x+y);
    }
 }
 
 class demothis1
  {
      public static void main(String asd[])
      {
        student obj=new student();
        System.out.println("object in main"+obj);
 
        student obj1=new student();
        System.out.println("object in main"+obj1);
 
      }
  }