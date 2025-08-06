class sample
 {
     sample()
     {  
       System.out.println("inside the constructor");
     }
     public void display(int x,int y)
     {
        System.out.println("x"+x);
        System.out.println("y"+y);
       
     }
     public void display1()
     {
        System.out.println("inside the display1");
     }
 }
 
   
class democons
 {
    public static void main(String ad[])
        {
           sample obj1=new sample();
           obj1.display(10, 12);
           sample obj2=new sample();
           obj2.display(100, 120);
        }
 }