class Animal {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Tiger extends Animal {
    void roar() {
        System.out.println(name + " roars loudly!");
    }
}
class Elephant extends Animal {
    void trumpet() {
        System.out.println(name + " trumpets with its trunk!");
    }
}
class Monkey extends Animal {
    void climb() {
        System.out.println(name + " climbs trees swiftly!");
    }
}





public class zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.name = "Sheru";
        tiger.age = 5;
        tiger.eat();       // inherited
        tiger.sleep();     // inherited
        tiger.roar();      // specific to Tiger

        Elephant elephant = new Elephant();
        elephant.name = "Appu";
        elephant.age = 10;
        elephant.eat();    // inherited
        elephant.sleep();
        elephant.trumpet(); // specific to Elephant

        Monkey monkey = new Monkey();
        monkey.name = "Chimpu";
        monkey.age = 3;
        monkey.eat();
        monkey.sleep();    // inherited
        monkey.climb();    // specific to Monkey
    }
}
