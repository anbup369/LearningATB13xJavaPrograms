package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL_Generics {
    public static void main(String[] args) {
        //Using List<Object> for type safety and clarity
        List<Object> list = new ArrayList<>(10);

        //Adding mixed-type elements
        list.add("1");     // Index 0
        list.add("2");     // Index 1
        list.add("3");     // Index 2
        list.add("3");     // Index 3 (duplicate String)
        list.add(4);       // Index 4 (Integer)
        list.add(true);    // Index 5 (Boolean)
        list.add("3");     // Index 6 (another duplicate)

        //List information
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Does list contain \"1\" (String)? " + list.contains("1"));
        System.out.println("Does list contain 1 (Integer)? " + list.contains(1));

        //Index operations
        System.out.println("Index of first '3': " + list.indexOf("3"));
        System.out.println("Index of last '3': " + list.lastIndexOf("3"));

        //Display entire list
        System.out.println("Complete List: " + list);
        System.out.println("----------- Using for loop -----------");

        //Iterating using traditional for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("----------- Using for-each loop -----------");

        //Iterating using enhanced for-each loop
        for (Object o : list) {
            System.out.println("Element: " + o);
        }

        //Updating an element
        list.set(1, 25); // Replace element at index 1 with Integer 25
        System.out.println("List after setting index 1 to 25: " + list);

        //Removing an element
        list.remove(0);  // Remove element at index 0
        System.out.println("List after removing element at index 0: " + list);

        //Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}