class Parent {
    String message = "Hello from Parent";
}

class Child extends Parent {
    String message = "Hello from Child";

    void displayMessages() {
        System.out.println("Parent Message: " + super.message);
        System.out.println("Child Message: " + this.message);
    }
}

public class p14d {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessages();
    }
}
