class karnataka

{

   private String cm,capital;

   private double area_state;

  public karnataka(String cm, String capital, double area_state) {
        this.cm = cm;
        this.capital = capital;
        this.area_state = area_state;
    }
 
    class mysuru

	{

	   String collector_name;

	   int area_dist;

	    mysuru(String collector_name,int area_dist)

		{

			this.collector_name=collector_name;								
            this.area_dist=area_dist;

		}

           public void displayMysuru()

		{

	    System.out.println("Name of CM "+cm);
        
        System.out.println("Capital of Karnataka "+capital);

		System.out.println("Name of the collector "+collector_name);

		System.out.println("District area "+area_dist);

		}

	   }

  }
 
class demonested

  {

     public static void main(String asd[])

	{
        karnataka ka=new karnataka("xyz","Bangaluru",1234);
        karnataka.mysuru my=ka.new mysuru("asd",123);
        my.displayMysuru();

	}

}
 