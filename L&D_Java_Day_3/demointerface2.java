interface Animal {
    void eat(); 
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

public class demointerface2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
