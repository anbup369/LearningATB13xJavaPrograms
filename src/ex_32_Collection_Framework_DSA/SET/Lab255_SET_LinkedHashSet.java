package ex_32_Collection_Framework_DSA.SET;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab255_SET_LinkedHashSet {
    public static void main(String[] args) {
        // Creating a LinkedHashSet to store String elements
        Set<String> linkedSet = new LinkedHashSet<>();

        // LinkedHashSet maintains insertion order
        // Duplicate elements are ignored
        // Allows one null element

        // Adding elements using add()
        linkedSet.add("Dpple");
        linkedSet.add("apple");
        linkedSet.add("Orange");
        linkedSet.add("WaterMelon");
        linkedSet.add("WaterMelon"); // Duplicate, will not be added
        linkedSet.add(null);         // Only one null allowed

        // Displaying entire LinkedHashSet
        System.out.println("LinkedHashSet contents: " + linkedSet);

        // Checking if the set contains a specific element
        System.out.println("Contains 'Apple'? " + linkedSet.contains("Apple"));
        System.out.println("Contains 'Orange'? " + linkedSet.contains("Orange"));

        // Checking size of the set
        System.out.println("Size of LinkedHashSet: " + linkedSet.size());

        // Checking if the set is empty
        System.out.println("Is LinkedHashSet empty? " + linkedSet.isEmpty());

        // Removing an element
        linkedSet.remove("apple");
        System.out.println("LinkedHashSet after removing 'apple': " + linkedSet);

        // Traversing using enhanced for loop
        System.out.println("Iterating using for-each loop:");
        for (String item : linkedSet) {
            System.out.println("Element: " + item);
        }

        // Traversing using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = linkedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Clearing the set
        linkedSet.clear();
        System.out.println("LinkedHashSet after clear(): " + linkedSet);

        // Final check
        System.out.println("Is LinkedHashSet empty after clear()? " + linkedSet.isEmpty());
    }
}