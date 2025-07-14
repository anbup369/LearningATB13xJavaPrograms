package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.ArrayDeque;

public class Lab260_ARRAYDeque {
    public static void main(String[] args) {
        // ArrayDeque allows insertion/removal at both ends
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements using add() and offer()
        deque.add(15);        // Inserts at tail
        deque.add(25);
        deque.offer(35);      // Also inserts at tail
        deque.offer(45);

        // Adding elements at head using push() (acts like a stack)
        deque.push(5);
        deque.push(1);

        // Display current state of the deque
        System.out.println("Initial ArrayDeque: " + deque);

        // Retrieving elements without removal
        System.out.println("Peek (head): " + deque.peek());       // returns null if empty
        System.out.println("Element (head): " + deque.element()); // throws exception if empty

        // Removing elements from head
        System.out.println("Poll (remove head): " + deque.poll());   // returns null if empty
        System.out.println("Remove (remove head): " + deque.remove()); // throws exception if empty

        // Display deque after removals
        System.out.println("Deque after poll and remove: " + deque);

        // Iterating through remaining elements
        System.out.println("Traversing remaining elements:");
        for (Integer num : deque) {
            System.out.println("Element: " + num);
        }
    }
}