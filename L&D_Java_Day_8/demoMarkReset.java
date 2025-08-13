import java.io.ByteArrayInputStream;

class demoMarkReset {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; 
        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        System.out.println("Reading first two characters:");
        System.out.println((char) bis.read()); 
        System.out.println((char) bis.read()); 

        bis.mark(0); 

        System.out.println("Reading next two characters:");
        System.out.println((char) bis.read()); 
        System.out.println((char) bis.read()); 

        bis.reset(); 

        System.out.println("After reset, reading again:");
        System.out.println((char) bis.read()); 
        System.out.println((char) bis.read()); 
        System.out.println((char) bis.read()); 
    }
}
