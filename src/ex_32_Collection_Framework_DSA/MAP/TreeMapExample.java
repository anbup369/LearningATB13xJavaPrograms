package ex_32_Collection_Framework_DSA.MAP;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Initialize TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Basic operations
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        treeMap.put("Grapes", null); // Null value is allowed

        try {
            // Edge Case: Null key (throws NullPointerException)
            treeMap.put(null, 100);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot insert null key into TreeMap.");
        }

        System.out.println("Initial TreeMap (Sorted):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Navigation operations
        System.out.println("\nNavigable Operations:");
        System.out.println(treeMap);
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Higher than 'Banana': " + treeMap.higherKey("Banana"));
        System.out.println("Lower than 'Banana': " + treeMap.lowerKey("Banana"));
        System.out.println("Ceiling Key Strawberry : " + treeMap.ceilingKey("Strawberry"));
        System.out.println("Floor Key for Strawberry: " + treeMap.floorKey("Strawberry"));
        System.out.println("SubMap from 'Banana' to 'Orange': " + treeMap.subMap("Banana", true, "Orange", true));

        // Modification operations
        treeMap.replace("Banana", 50);                       // Replace value
        treeMap.remove("Grapes");                            // Remove key
        treeMap.putIfAbsent("Mango", 60);                    // Conditional add
        treeMap.computeIfPresent("Mango", (k, v) -> {
            System.out.println("Updating '" + k + "' from " + v + " to " + (v + 10));
            return v + 10;
        });

        System.out.println("\nTreeMap after Modifications:");
        System.out.println(treeMap);

        // Querying
        System.out.println("\nContains 'Apple'? " + treeMap.containsKey("Apple"));
        System.out.println("Value for 'Orange'? " + treeMap.getOrDefault("Orange", -1));

        // Clearing the map
        treeMap.clear();
        System.out.println("\nTreeMap after clear(): " + treeMap);
    }
}