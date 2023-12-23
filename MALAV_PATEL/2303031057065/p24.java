import java.util.Iterator;
import java.util.Vector;

public class p24 {
    public static void main(String[] a) {
        // Create a Vector to store strings
        Vector<String> vct = new Vector<String>();

        // Add elements to the Vector
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");

        // Create an Iterator to traverse the Vector
        Iterator<String> itr = vct.iterator();

        // Iterate over the Vector using the Iterator
        while (itr.hasNext()) {
            // Retrieve and print each element
            System.out.println(itr.next());
        }
    }
}
