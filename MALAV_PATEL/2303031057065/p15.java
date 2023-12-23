// write a program to use super and methods

class outerClass{
    private int outerData = 10;

    class innerClass{
        void display(){
            System.out.println("Inner Class : Accessing OuterData from Inner class :"+outerClass);
        }
    }
    // method that uses the InnerClass
    void useInnerClass(){
        innerClass inner = new innerClass();
        inner.display();
    }
}
public class p15{
    public static void main(String[] args) {
        outerClass outer = outerClass();

        outer.useInnerClass();

        outerClass.innerClass innerDirect = outer.new innerClass();
        innerDirect.display();
    }
}