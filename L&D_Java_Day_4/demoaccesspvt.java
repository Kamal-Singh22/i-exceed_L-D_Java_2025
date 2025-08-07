
import java.lang.reflect.Method;

class Secret {
    private void display() {
        System.out.println("This is a secret method!");
    }
}

public class demoaccesspvt {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Secret");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getDeclaredMethod("display");
        method.setAccessible(true);

        method.invoke(obj); 
    }
}
