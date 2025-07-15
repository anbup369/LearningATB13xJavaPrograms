package ex_32_Collection_Framework_DSA.MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab263_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Adding entries with various key/value combinations
        lhm.put("Apple", 10);
        lhm.put("Banana", 20);
        lhm.put("Orange", 30);
        lhm.put(null, 40); // Demonstrating usage of null key
        lhm.put("Grapes", null); // Demonstrating usage of null value

        // Iteration using entrySet to print key-value pairs
        System.out.println("----- Iteration using entrySet -----");
        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.printf("Key: %-7s | Value: %s%n", entry.getKey(), entry.getValue());
        }

        // Iteration using keySet and retrieving values manually
        System.out.println("\n----- Iteration using keySet -----");
        for (String key : lhm.keySet()) {
            System.out.printf("Key: %-7s | Value: %s%n", key, lhm.get(key));
        }

        // Checking for existence of keys and values
        System.out.println("\n----- Contains Operations -----");
        System.out.println("Contains key 'Banana'? " + lhm.containsKey("Banana"));
        System.out.println("Contains value 20? " + lhm.containsValue(20));

        // Removing and replacing entries
        lhm.remove("Apple"); // Removing an entry
        lhm.replace("Banana", 25); // Replacing value of an existing key

        // Displaying the updated LinkedHashMap
        System.out.println("\n----- Updated LinkedHashMap -----");
        System.out.println(lhm);

        // Demonstrating access-order based LinkedHashMap
        System.out.println("\n----- Access Order Enabled -----");
        Map<String, String> accessOrderMap = new LinkedHashMap<>(5, 0.75f, true);
        accessOrderMap.put("A", "Apple");
        accessOrderMap.put("B", "Banana");
        accessOrderMap.put("C", "Cherry");

        // Initial order after insertion
        System.out.println("Initial order: " + accessOrderMap);

        // Accessing entries shifts them to the end
        accessOrderMap.get("B"); // 'B' moves to end
        System.out.println("After accessing B: " + accessOrderMap);

        accessOrderMap.get("A"); // 'A' moves to end
        System.out.println("After accessing A: " + accessOrderMap);

        accessOrderMap.get("C"); // 'C' moves to end
        System.out.println("After accessing C: " + accessOrderMap);
    }
}