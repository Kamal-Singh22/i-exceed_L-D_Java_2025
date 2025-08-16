
import java.util.ArrayList;
import java.util.List;

class arrayListExample {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<String> names = new ArrayList<String>();

        // Add elements to the list
        names.add("java");
        names.add("Javascript");
        names.add("python");
        System.out.println("List: " + names);

        // Access element from the list
        String name = names.get(1);
        System.out.println("Accessed Element: " + name);

        // Remove element from the list
        names.remove("python");
        System.out.println("After Removed name: " + names);
    }
}
