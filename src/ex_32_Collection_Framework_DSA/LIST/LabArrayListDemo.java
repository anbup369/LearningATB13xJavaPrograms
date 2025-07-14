package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LabArrayListDemo {
    public static void main(String[] args) {

        // Creating ArrayLists of different types
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        List<Object> mixedList = new ArrayList<>();

        // Adding elements
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        intList.add(10);
        intList.add(20);
        intList.add(30);

        mixedList.add("Hello");
        mixedList.add(100);
        mixedList.add(true);

        // Inserting at specific index
        stringList.add(1, "Mango");
        intList.add(2, 25);

        // Modifying elements
        stringList.set(0, "Avocado");
        intList.set(1, 15);

        // Removing by element and index
        stringList.remove("Cherry");
        if (!intList.isEmpty()) {
            intList.removeFirst();
        }

        // Retrieving elements by index
        System.out.println("Element at index 1 in stringList: " + stringList.get(1));
        System.out.println("Element at index 0 in intList: " + intList.getFirst());

        // Checking size and emptiness
        System.out.println("Size of stringList: " + stringList.size());
        System.out.println("Is intList empty? " + intList.isEmpty());

        // Searching elements
        System.out.println("Does stringList contain 'Banana'? " + stringList.contains("Banana"));
        System.out.println("Index of 25 in intList: " + intList.indexOf(25));

        // Traversing using for-each loop
        System.out.println("Contents of stringList:");
        for (String item : stringList) {
            System.out.println("Element: " + item);
        }

        System.out.println("Contents of intList:");
        for (Integer number : intList) {
            System.out.println("Element: " + number);
        }

        System.out.println("Contents of mixedList:");
        for (Object obj : mixedList) {
            System.out.println("Element: " + obj);
        }

        // Traversing using Iterator
        System.out.println("Traversing stringList using Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Edge Case: Accessing invalid index
        try {
            System.out.println("Accessing index out of bounds: " + stringList.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Clearing all lists
        stringList.clear();
        intList.clear();
        mixedList.clear();

        // Final check
        System.out.println("stringList after clear(): " + stringList);
        System.out.println("intList after clear(): " + intList);
        System.out.println("mixedList after clear(): " + mixedList);
    }
}