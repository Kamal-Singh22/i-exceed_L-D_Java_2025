class Doctor
 {
    String d_Name,Specialization;
    int contact;

    Doctor(String d_Name,String Specialization,int contact){
        this.d_Name=d_Name;
        this.Specialization=Specialization;
        this.contact=contact;
    }
    public void DisplayDoctorDetails(){
        System.out.println("Name of Doctor: "+d_Name);
        System.out.println("specialization of doctor is: "+Specialization);
        System.out.println("Contact is: "+contact);
    }
    
}
class Doctor1
{
    String Name,specilization,Location;
    int Contact;
}
