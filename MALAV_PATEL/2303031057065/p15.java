class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display(); // Calling the parent class method using super
        System.out.println("This is the child class.");
    }
}

public class p15 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
