class one extends Thread {
    private String threadName;

    one(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " - iteration " + i);
            //Thread.yield(); // Hint to scheduler to switch threads
        }
    }
}

public class demothreadyield1 {
    public static void main(String[] args) {
        one t1 = new one("Thread-A");
        one t2 = new one("Thread-B");

        t1.start();
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread - iteration " + i);
            //Thread.yield(); // Main thread also yields
        }
    }
}
