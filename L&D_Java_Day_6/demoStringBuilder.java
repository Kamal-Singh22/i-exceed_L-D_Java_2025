public class demoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("Welcome to i-exceed.");
        sb.insert(4, "hi");
        sb.replace(1, 4, "welcome");
        System.out.println(sb);
    }
    
}
