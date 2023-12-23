import java.util.LinkedList;

class p25{
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in the linked list
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);
    
    // add() method with the index parameter
    languages.add(1, "C");
    System.out.println("Inserted LinkedList: " + languages);


    // get the element from the linked list
    String str = languages.get(1);
    System.out.println("Element at index 1: " + str);
    
    // change elements at index 3
    languages.set(3, "HTML");
    System.out.println("Updated LinkedList: " + languages);
    
  }
}
