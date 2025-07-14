package ex_32_Collection_Framework_DSA.SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab256_SET_TreeSet {
    public static void main(String[] args) {
        // Creating a TreeSet to store Integer elements
        Set<Integer> treeSet = new TreeSet<>();

        // TreeSet maintains natural sorted order (ascending)
        // Does not allow null elements
        // Duplicate elements are ignored

        // Adding elements using add()
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3); // Duplicate, will not be added

        // Displaying full TreeSet
        System.out.println("TreeSet contents (sorted): " + treeSet);

        // Checking if specific elements exist
        System.out.println("Contains 3? " + treeSet.contains(3));
        System.out.println("Contains 10? " + treeSet.contains(10));

        // Removing an element
        treeSet.remove(5);
        System.out.println("TreeSet after removing 5: " + treeSet);

        // Checking size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Checking if TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Traversing using enhanced for loop
        System.out.println("Iterating using for-each loop:");
        for (Integer num : treeSet) {
            System.out.println("Element: " + num);
        }

        // Traversing using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Clearing all elements
        treeSet.clear();
        System.out.println("TreeSet after clear(): " + treeSet);

        // Final emptiness check
        System.out.println("Is TreeSet empty after clear()? " + treeSet.isEmpty());
    }
}