class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class p14b{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound(); // Calls sound method of Animal class
        dog.sound();    // Calls overridden sound method of Dog class
    }
}
