package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList_Generics {
    public static void main(String[] args) {

        //Using ArrayList<Object> to allow mixed-type entries with type safety
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("pramod");     // Add a String
        arrayList.add(null);         // Add null value
        arrayList.add("dutta");      // Add another String
        arrayList.add("dutta");      // Duplicate entry (allowed)
        arrayList.add(123);          // Add Integer value

        //Display contents of arrayList and its size
        System.out.println("➡ Contents of arrayList: " + arrayList);
        System.out.println("Size of arrayList: " + arrayList.size());

        //Using List<Object> for dynamic dispatch
        List<Object> l = new ArrayList<>();
        l.add("123");   // Add String
        l.add("456");   // Add another String

        //Display contents and check if empty
        System.out.println("\n Contents of list 'l': " + l);
        System.out.println(" Is list 'l' empty? " + l.isEmpty());

        //Another empty List instance
        List<Object> l2 = new ArrayList<>();

        //Display check for empty and actual contents
        System.out.println("\n Is list 'l2' empty? " + l2.isEmpty());
        System.out.println("Contents of list 'l2': " + l2);
    }
}