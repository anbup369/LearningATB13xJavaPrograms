package ex_32_Collection_Framework_DSA.LIST;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
    public static void main(String[] args) {
        // Integer Vector operations
        Vector<Integer> intVector = new Vector<>();

        intVector.add(10);                         // Add at end
        intVector.addElement(20);                  // Add using addElement()
        intVector.insertElementAt(15, 1);          // Insert at index

        System.out.println("Integer Vector: " + intVector);

        intVector.removeFirst();                       // Remove by index
        intVector.removeElement(Integer.valueOf(20)); // Remove by object
        System.out.println("After Removals: " + intVector);

        System.out.println("Contains 15: " + intVector.contains(15));
        System.out.println("Element at index 0: " + intVector.getFirst());

        // String Vector operations
        Vector<String> strVector = new Vector<>();
        strVector.add("apple");
        strVector.add("banana");
        strVector.set(1, "blueberry");             // Update element

        System.out.println("\nString Vector: " + strVector);

        strVector.clear();                         // Clear all elements
        System.out.println("String Vector after clear: " + strVector);

        // Edge cases
        Vector<Double> doubleVector = new Vector<>();

        System.out.println("\nDouble Vector is empty: " + doubleVector.isEmpty());

        try {
            System.out.println("First element: " + doubleVector.firstElement());
        } catch (Exception e) {
            System.out.println("Error: Vector is empty, cannot fetch first element.");
        }

        doubleVector.add(null);                    // Adding null is allowed
        System.out.println("Double Vector with null: " + doubleVector);

        // Enumeration for iteration
        Vector<Character> charVector = new Vector<>();
        charVector.add('X');
        charVector.add('Y');
        charVector.add('Z');

        System.out.print("\nCharacters: ");
        Enumeration<Character> enumeration = charVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // Capacity and resizing
        Vector<String> resizeVector = new Vector<>(2);  // Initial capacity
        resizeVector.add("one");
        resizeVector.add("two");
        resizeVector.add("three");                      // Auto-expands

        System.out.println("\n\nResizeVector contents: " + resizeVector);
        System.out.println("Current capacity: " + resizeVector.capacity());
    }
}