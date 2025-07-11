package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        // Creating an ArrayList with initial capacity of 5 (not used further here)
        List mylist = new ArrayList(5);

        // Creating a default ArrayList (dynamic continuous array structure)
        List mylist0 = new ArrayList();

        // Creating a LinkedList (doubly linked list structure)
        List mylist2 = new LinkedList();

        // Adding various types of elements to the LinkedList
        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");   // Duplicate entry
        mylist2.add(null);       // Null element
        mylist2.add(true);       // Boolean value
        mylist2.add(123);        // Integer value

        // Printing entire list
        System.out.println("Contents of LinkedList: " + mylist2);

        // Checking if list is empty
        System.out.println("Is list empty? " + mylist2.isEmpty());

        // Getting size of the list
        System.out.println("Size of the list: " + mylist2.size());

        // Checking if list contains a specific element
        System.out.println("Does the list contain 'Dutta'? " + mylist2.contains("Dutta"));

        // Finding the index of an element
        System.out.println("Index of 'Dutta': " + mylist2.indexOf("Dutta"));

        // Getting the first element
        System.out.println("First element: " + mylist2.get(0));

        System.out.println(" --- Iterating over list elements ---");

        // Using Iterator to traverse list
        Iterator iterator = mylist2.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}