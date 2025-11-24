// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";

        d.eat();     // inherited method
        d.sleep();   // inherited method
        d.bark();    // child class method
    }
}

