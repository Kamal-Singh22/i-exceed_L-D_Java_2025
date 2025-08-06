class car
{

    String  nameofCompany;

    boolean isAvailable;
 
    car(String nameofCompany,boolean isAvailable)
    {
        this.nameofCompany=nameofCompany;
        this.isAvailable=isAvailable;
 
	}
 
    public void getCarDetails()

	{

	  System.out.println("Company: "+nameofCompany);

	  System.out.println("Availability: "+isAvailable);
 
	}

   }
 
   class Scorpio extends car

     {

	 String carName,modelName,color;
 
	 Scorpio(String carName,String modelName,String color)

	  {

	     super("Mahindra",true);

	     this.carName=carName;

	     this.modelName=modelName;

	     this.color=color;

	   }
 
	  public void displayCarModel()

		{
            System.out.println("Name of the car: "+carName);
            System.out.println("Model: "+modelName);
            System.out.println("Color:"+color);

		}

      }	
public class carDemo 
{
    public static void main(String args[])
    {

	   Scorpio c1=new Scorpio("BMW","BMW811","black");

	   c1.getCarDetails();

	   c1.displayCarModel();				

	}
}
