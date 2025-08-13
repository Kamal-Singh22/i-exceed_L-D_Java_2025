import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class demoFileReader1 {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        File file = new File(args[0]);

        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
