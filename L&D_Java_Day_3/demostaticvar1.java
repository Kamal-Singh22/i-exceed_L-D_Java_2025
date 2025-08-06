class demostaticvar1

{

   static int x; // output 1 2 3
   //int x;   // output 1 1 1
 
    demostaticvar1()

	{

	   x++;

	   System.out.println(x);

	}
 
    public static void main(String asd[])

	{

	   demostaticvar1 obj1=new demostaticvar1();

	   demostaticvar1 obj2=new demostaticvar1();

	   demostaticvar1 obj3=new demostaticvar1();

	}

}
 