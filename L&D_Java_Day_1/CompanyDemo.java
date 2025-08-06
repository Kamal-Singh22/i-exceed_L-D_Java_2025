class company

{

    String nameofcom;

    String city;
 
    company(String nameofcom,String city)

	

	{

	  this.nameofcom=nameofcom;

	  this.city=city;

	}
	public void displayDetails()
	 {
        System.out.println("Company Name: " + nameofcom);
        System.out.println("City: " + city);
    }

  }
 
class HR extends company

{
	String EmployeeDetails;
HR(String nameofcom, String city,String EmployeeDetails) {
        super(nameofcom, city);
		this.EmployeeDetails=EmployeeDetails;
    
    
 
	}
	public void DisplayHr()
	{
		displayDetails();
		System.out.println("Name of the Employee: "+EmployeeDetails);
	}

}
 
 
class Finance extends company

{
	int profit;

     Finance(String nameofcom, String city,int profit) {
        super(nameofcom, city); 
		this.profit=profit;
	 }

	 public void DisplayFinanceDetail(){
		displayDetails();
		System.out.println("Profit of the Company: "+profit);
		
	 }
}
public class CompanyDemo
{
	public static void main(String[] args)
	 {
		HR obj1=new HR("I-Exceed","Bangaluru","Shyam Kora");
		obj1.DisplayHr();
		Finance obj2=new Finance("I-Exceed", "Bangaluru",120000);
		obj2.DisplayFinanceDetail();
		
	}
}
 