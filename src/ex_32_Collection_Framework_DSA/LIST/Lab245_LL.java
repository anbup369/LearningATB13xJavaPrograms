package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args) {

        //Using LinkedList<String> to store animal names with type safety
        LinkedList<String> animals = new LinkedList<>();

        //Adding elements to the list
        animals.add("Dog");             // Add at the end
        animals.add("Cat");             // Add at the end
        animals.addFirst("Lion");       // Add at the beginning
        animals.addLast("Elephant");    // Add at the end
        animals.addLast("Elephant");    // Duplicate allowed

        // Displaying list content
        System.out.println(" Initial LinkedList: " + animals);

        // Accessing elements
        System.out.println(" First element: " + animals.getFirst());
        System.out.println(" Last element: " + animals.getLast());

        // Removing first and last elements
        animals.removeFirst();          // Removes "Lion"
        animals.removeLast();           // Removes last "Elephant"

        // Display list after removal
        System.out.println(" LinkedList after removal: " + animals);

        // Displaying size of the list
        System.out.println(" Size of LinkedList: " + animals.size());
    }
}