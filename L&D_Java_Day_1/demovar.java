class sample{
    public void iterate(){

    
    for(var i=0; i<=10; i++){
         System.out.println(i);
}

    }
   
}

public class demovar {
    public static void main(String[] args) {
        new sample().iterate();
        var x=19;
        var y=12.22;
        var name="Kamal Singh";
        System.out.println(((Object)x).getClass().getSimpleName());
        System.out.println(x);
        System.out.println(y);
        System.out.println(name);
    }
    
}
