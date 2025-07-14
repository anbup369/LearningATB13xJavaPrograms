package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab254_SET_HashSet {
    public static void main(String[] args) {
        // Creating a HashSet to store String elements
        Set<String> hs = new HashSet<>();

        // Adding elements using add()
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("Banana");

        // Attempting to add a duplicate
        hs.add("Apple"); // Will be ignored since duplicates are not allowed

        // Adding a null element
        hs.add(null); // Only one null is allowed

        // Displaying full HashSet (order is not guaranteed)
        System.out.println("HashSet contents: " + hs);

        // Checking size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Checking if a particular element exists
        System.out.println("Does HashSet contain 'Orange'? " + hs.contains("Orange"));
        System.out.println("Does HashSet contain 'Grapes'? " + hs.contains("Grapes"));

        // Removing elements
        hs.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hs);

        // Traversing HashSet using enhanced for loop
        System.out.println("Iterating using for-each loop:");
        for (String s : hs) {
            System.out.println("Element: " + s);
        }

        // Traversing HashSet using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Clearing all elements
        hs.clear();
        System.out.println("HashSet after clear(): " + hs);

        // Checking if the HashSet is empty
        System.out.println("Is HashSet empty? " + hs.isEmpty());
    }
}