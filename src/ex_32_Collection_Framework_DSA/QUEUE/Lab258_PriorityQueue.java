package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab258_PriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue stores elements in natural order (alphabetical for Strings)
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Adding elements using add() and offer()
        queue.add("Pramod");
        queue.add("Dutta");
        queue.offer("Akash");
        queue.offer("Bhavna");

        // Display current state of the queue
        System.out.println("Initial Queue: " + queue);

        // peek() – retrieves head without removing
        System.out.println("Head using peek(): " + queue.peek());

        // element() – retrieves head, throws exception if queue is empty
        System.out.println("Head using element(): " + queue.element());

        // poll() – removes and returns head, returns null if empty
        System.out.println("Removed using poll(): " + queue.poll());

        // remove() – removes and returns head, throws exception if empty
        System.out.println("Removed using remove(): " + queue.remove());

        // Display remaining elements
        System.out.println("Remaining Queue after poll() and remove(): " + queue);

        // Iterating through queue
        System.out.println("Traversing the remaining elements:");
        for (String name : queue) {
            System.out.println("Element: " + name);
        }
    }
}