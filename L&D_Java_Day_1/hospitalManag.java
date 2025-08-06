

class patient
{
    String Name,Address;
    int Age,patient_id;
    Doctor doctor;
    
    patient(String Name,String Address,int Age,int patient_id,Doctor doctor) 
    {
        this.Name=Name;
        this.Address=Address;
        this.Age=Age;
        this.patient_id=patient_id;
        this.doctor=doctor;
    }

    public void displayPatientDetails()
    {
         System.out.println("Patient ID is: "+patient_id);
        System.out.println("Name of the Patient is: "+Name);
        System.out.println("Address is: "+Address);
        System.out.println("Age of the Patient is: "+Age);
        doctor.DisplayDoctorDetails();

    }

    
}



public class hospitalManag 
{
    public static void main(String[] args) {
        

    Doctor doct1=new Doctor("Aarju Rana","Skin",123456789);
    Doctor doct2=new Doctor("Sanjiv Reddy","Heart",123456789);

    patient pat1=new patient("Himal","London", 44,1,doct1);
    patient pat2=new patient("Joyal","Barcelona", 70,2,doct2);
    pat1.displayPatientDetails();
    pat2.displayPatientDetails();

    

    
}
}
