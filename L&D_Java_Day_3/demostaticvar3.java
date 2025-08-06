class Sample {
    int x = 10;                // Instance variable
    static int y = 20;         // Static variable

    static {
        System.out.println("Static block executed");
        y = 50;                // Initializing or modifying static variable
    }

    Sample() {
        x++;
        y++;
    }

    void display() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}

class demostaticvar3 {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        obj1.display();

        Sample obj2 = new Sample();
        obj2.display();

        Sample obj3 = new Sample();
        obj3.display();
    }
}
