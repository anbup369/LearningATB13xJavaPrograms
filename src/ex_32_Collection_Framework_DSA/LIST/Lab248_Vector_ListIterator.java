package ex_32_Collection_Framework_DSA.LIST;

// 🔄 ListIterator supports bidirectional traversal (forward and backward),
// whereas Iterator allows only forward movement

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {

        // 🧺 Initialize a Vector of Strings
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        //  Forward Iteration using ListIterator
        System.out.println(" Forward Traversal with ListIterator:");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(" → " + listIterator.next());
        }

        //  Backward Iteration using ListIterator
        System.out.println("\n Backward Traversal with ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(" ← " + listIterator.previous());
        }

        //  Forward Iteration using Iterator
        System.out.println("\n Forward Traversal with Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(" → " + iterator.next());
        }
    }
}