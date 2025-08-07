class Area
{
    private int l,b,h;

    Area(int l, int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void getArea(){
        int area=l*b*h;
        System.out.println(": "+area);
    }

}
public  class demoEncap
{
    public static void main(String[] args) {
        
   
    Area a=new Area(12,13,9);
     a.getArea();
}
}