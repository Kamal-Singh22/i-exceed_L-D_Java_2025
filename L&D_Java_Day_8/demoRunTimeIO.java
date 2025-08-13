import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class demoRunTimeIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the content to write into the file: ");
        String content = sc.nextLine();

        // Write content to file
        try (FileOutputStream fout = new FileOutputStream(fileName)) {
            byte[] byteContent = content.getBytes();
            fout.write(byteContent);
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read content using BufferedInputStream
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName))) {
            int i;
            System.out.println("\nFile content:");
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        sc.close();
    }
}
