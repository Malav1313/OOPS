class Parent {
    String message = "Hello From Parent";
}

class Child extends Parent{
    String message = "Hello From Child";

    void displayMessages(){
        System.out.println("Parent Message :" +super.message);
        System.out.println("Child Message :" +this.message);
    }
}

public class super14{
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessages();
    }
}