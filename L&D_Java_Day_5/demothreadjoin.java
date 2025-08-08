class sample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " sample: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class demothreadjoin {
    public static void main(String[] args) throws InterruptedException {
        
        sample obj1 = new sample();
        obj1.setName("Thread-1");
        obj1.start();
        obj1.join();

        // Anonymous thread 1
        class Anony{}
        Thread anon1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " anonymous-1: " + i);
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        anon1.setName("Anony Thread 1");
        anon1.start();
        anon1.join();

        sample obj2 = new sample();
        obj2.setName("Thread 2");
        obj2.start();
        obj2.join();

       
    }
}
