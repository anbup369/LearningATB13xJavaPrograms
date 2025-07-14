package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab259_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // Adding elements using add() and offer()
        numbers.add(10);
        numbers.add(20);
        numbers.offer(30);
        numbers.offer(40);

        // Retrieve but do NOT remove the head using element() and peek()
        System.out.println("Peek (head using peek): " + numbers.peek());
        System.out.println("Element (head using element): " + numbers.element());

        // Retrieve AND remove the head using remove() and poll()
        System.out.println("Poll (removing head): " + numbers.poll());
        System.out.println("Remove (removing head): " + numbers.remove());

        // Traversing remaining elements using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Remaining numbers in queue:");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Number: " + number);
        }
    }
}