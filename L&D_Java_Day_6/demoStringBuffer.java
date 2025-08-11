public class demoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.reverse();

        System.out.println(sb);
    }
}
