class OuterClass {
    private int outerData = 10;

    // Inner class definition
    class InnerClass {
        void display() {
            System.out.println("InnerClass: Accessing outerData from inner class: " + outerData);
        }
    }

    // Method that uses the InnerClass
    void useInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class p16 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Accessing the inner class through the outer class
        outer.useInnerClass();
        
        // Creating an instance of the inner class directly
        OuterClass.InnerClass innerDirect = outer.new InnerClass();
        innerDirect.display();
    }
}
