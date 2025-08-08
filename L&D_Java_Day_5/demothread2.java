class Simple extends Thread{

    public void run(){
        for(int i=0;i<=10;i++){
            try{

                System.out.println(i);
                Thread.sleep(500);
            }catch(InterruptedException d){}
            
        }
    }
}

public class demothread2 {
    public static void main(String[] args) {
        
   
    Simple s=new Simple();
    s.start();
    
}

 }