class sample extends Thread

{ 
    public void run()

	{
        Thread.currentThread().setName("i-exceed thread");
        System.out.println("Inside run method\t"+Thread.currentThread().getName());

	}

}
 
class demothread1

{

    public static void main(String asd[])

	{

	 Thread t=Thread.currentThread();
     t.setName("Main Thread");

	  System.out.println("Name in Main mathod\t"+Thread.currentThread().getName());

	  sample obj=new sample();

	  obj.start();

	} 

}
 