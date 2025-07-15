package ex_32_Collection_Framework_DSA.MAP;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Lab264_Hashtable {
    public static void main(String[] args) {
        // Hashtable: Synchronized, Legacy, No null keys/values, Thread-safe

        // Create a Hashtable
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Put operations (duplicate key gets overwritten)
        ht1.put(1, "one");
        ht1.put(1, "ONE"); // Overwrites previous value
        ht1.put(2, "two");
        ht1.put(3, "three");

        // Edge cases: null keys or values are not allowed
        // ht1.put(4, null);       // Throws NullPointerException
        // ht1.put(null, "three"); // Throws NullPointerException

        System.out.println("Initial Hashtable contents:");
        System.out.println(ht1);

        // Demonstrate core functions
        System.out.println("\nKey-value pairs using modern keySet and get:");
        for (Integer key : ht1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + ht1.get(key));
        }

        System.out.println("\nContains checks:");
        System.out.println("Contains key 1? " + ht1.containsKey(1));
        System.out.println("Contains value 'two'? " + ht1.containsValue("two"));
        System.out.println("Contains key 4? " + ht1.containsKey(4));
        System.out.println("Contains value 'four'? " + ht1.containsValue("four"));

        // Remove and replace operations
        ht1.remove(2);
        ht1.replace(3, "THREE");

        System.out.println("\nAfter remove and replace:");
        System.out.println(ht1);

        // Enumeration of keys
        System.out.println("\nEnumerating keys using legacy API:");
        Enumeration<Integer> keyEnum = ht1.keys();
        while (keyEnum.hasMoreElements()) {
            System.out.println("Key: " + keyEnum.nextElement());
        }

        // Enumeration of values
        System.out.println("\nEnumerating values using legacy API:");
        Enumeration<String> valueEnum = ht1.elements();
        while (valueEnum.hasMoreElements()) {
            System.out.println("Value: " + valueEnum.nextElement());
        }

        // EntrySet for modern iteration
        System.out.println("\nIterating using entrySet:");
        Set<Map.Entry<Integer, String>> entries = ht1.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Demonstrate clear and isEmpty
        ht1.clear();
        System.out.println("\nHashtable after clear:");
        System.out.println(ht1);
        System.out.println("Is Hashtable empty? " + ht1.isEmpty());


    }
}