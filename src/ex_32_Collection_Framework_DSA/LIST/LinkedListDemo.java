package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Integer LinkedList operations
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(10);                            // Add at end
        intList.addFirst(5);                        // Add at beginning
        intList.addLast(15);                        // Add at end (same as add())
        intList.add(1, 8);                          // Add at index

        System.out.println("Integer List: " + intList);

        intList.removeFirst();                      // Remove from beginning
        intList.removeLast();                       // Remove from end
        intList.remove(Integer.valueOf(8));         // Remove specific element

        System.out.println("After Removals: " + intList);

        if (intList.contains(10)) {
            System.out.println("List contains 10");
        }

        System.out.println("Element at index 0: " + intList.getFirst());

        // String LinkedList operations
        LinkedList<String> strList = new LinkedList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("cherry");
        strList.set(1, "blueberry");               // Update element

        System.out.println("\nString List: " + strList);

        strList.clear();                           // Clear entire list
        System.out.println("String List after clear: " + strList);

        // Edge cases
        LinkedList<Double> doubleList = new LinkedList<>();

        System.out.println("\nDouble List is empty: " + doubleList.isEmpty());

        try {
            doubleList.getFirst();                // Throws NoSuchElementException if empty
        } catch (Exception e) {
            System.out.println("Error: List is empty, cannot get first element.");
        }

        doubleList.add(null);                     // Adding null is allowed
        System.out.println("Double List with null: " + doubleList);

        // Iterating with Iterator
        LinkedList<Character> charList = new LinkedList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');

        System.out.print("\nCharacters: ");
        Iterator<Character> iterator = charList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Peek and poll operations
        System.out.println("\n\nPeeking: " + charList.peek());       // Retrieves head without removing
        System.out.println("Polling: " + charList.poll());           // Retrieves head and removes it
        System.out.println("After poll: " + charList);
    }
}