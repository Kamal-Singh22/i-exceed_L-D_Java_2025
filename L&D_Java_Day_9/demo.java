
import java.util.*;

class sample {

    List a = new LinkedList();

    sample() {
        a.add("python");
        a.add("java");
        a.add("js");
        a.add("scala");
        a.add("Go");

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
