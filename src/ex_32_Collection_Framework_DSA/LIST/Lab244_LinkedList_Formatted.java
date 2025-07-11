package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab244_LinkedList_Formatted {
    public static void main(String[] args) {

        //Using List<String> for type safety and better readability
        List<String> list = new LinkedList<>();

        //Adding elements to the LinkedList
        list.add("a");
        list.add("b");
        list.add("c");

        // Displaying the list
        System.out.println(" LinkedList contents: " + list);

        // Displaying individual elements using for-each loop
        System.out.println(" Iterating through LinkedList:");
        for (String element : list) {
            System.out.println("Element: " + element);
        }

        // Checking size of the list
        System.out.println(" Size of LinkedList: " + list.size());

        // Checking if the list is empty
        System.out.println(" Is the LinkedList empty? " + list.isEmpty());
    }
}