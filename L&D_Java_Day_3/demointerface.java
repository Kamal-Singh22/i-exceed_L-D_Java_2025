interface one

{

    public void methodfromone();
 
}
 
interface two extends one

{

    public void methodfromtwo();

}
 
class sample implements two

  {

     sample()

	{
 
	}

    @Override

     public void methodfromone(){

	 System.out.println("method from interface one");

	}
 
    @Override

     public void methodfromtwo(){

	System.out.println("method from interface two");

	}

}
 
class demointerface

{

    public static void main(String asd[])

	{

	  one ref1 = new sample();
      ref1.methodfromone();

      two ref2 = new sample();
      ref2.methodfromone();
      ref2.methodfromtwo(); 
	

	}

}
 