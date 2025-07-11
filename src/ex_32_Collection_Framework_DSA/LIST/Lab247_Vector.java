package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        // Creating Vector instances
        Vector v = new Vector();         // Default size is 10
        Vector v1 = new Vector(10);      // Explicit capacity of 10 (unused here)

        // Adding elements to the vector
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");

        // Printing the contents
        System.out.println("Initial Vector Elements: " + v);

        // Removing an element by value
        v.remove("Amit");

        // Checking presence of an element
        System.out.println("Does vector contain 'Lucky'?: " + v.contains("Lucky"));

        // Printing vector after removal
        System.out.println("Updated Vector Elements: " + v);

        // Accessing elements using traditional for loop
        System.out.println("\n Accessing via traditional for loop ");
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Element at index " + i + ": " + v.get(i));
        }

        // Accessing elements using for-each loop
        System.out.println("\n-- Accessing via For-Each Loop --");
        for (Object o : v) {
            System.out.println("Element: " + o);
        }

        // Accessing using Iterator
        System.out.println("\n-- Accessing via Iterator --");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator Element: " + iterator.next());
        }

        //Accessing using Enumeration
        System.out.println("\n-- Accessing via Enumeration --");
        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("Enumeration Element: " + enumeration.nextElement());
        }
    }
}