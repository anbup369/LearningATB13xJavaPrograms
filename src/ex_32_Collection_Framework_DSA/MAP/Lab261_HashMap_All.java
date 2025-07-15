package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Collections;

public class Lab261_HashMap_All {
    public static void main(String[] args) {

        // Create a HashMap with mixed key and value types
        Map<Object, Object> map = new HashMap<>();

        // Key overwriting demonstration
        map.put("id", 1);            // Initial value
        map.put("id", 2);            // Overwritten value

        // Adding diverse entries
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id6", 34);
        map.put("id4", null);        // Allows null values
        map.put("id5", null);
        map.put(null, 102);          // Allows one null key
        map.put(null, 103);          // Overwrites previous null key

        // Print full map content
        System.out.println("\n--- Complete Map ---");
        System.out.println("Map: " + map);

        // Size of the map
        System.out.println("\n--- Map Size ---");
        System.out.println("Size: " + map.size());

        // Check if empty
        System.out.println("\n--- Empty Check ---");
        System.out.println("Is Empty: " + map.isEmpty());

        // Check presence of key and value
        System.out.println("\n--- Key & Value Checks ---");
        System.out.println("Contains Key 'id2': " + map.containsKey("id2"));
        System.out.println("Contains Value 99 : " + map.containsValue(99));

        // Get all keys
        System.out.println("\n--- Keys ---");
        System.out.println("Keys: " + map.keySet());

        // Get all values
        System.out.println("\n--- Values ---");
        System.out.println("Values: " + map.values());

        // Get value for a specific key
        System.out.println("\n--- Get Specific Value ---");
        System.out.println("Value for 'id3': " + map.get("id3"));

        // Remove key-value pair
        System.out.println("\n--- Remove Entry 'id3' ---");
        System.out.println("Removed Value: " + map.remove("id3"));

        // Updated map
        System.out.println("\n--- Map After Removal ---");
        System.out.println("Map: " + map);

        // Use putIfAbsent to avoid overwriting if key exists
        map.putIfAbsent("id2", 100);
        map.putIfAbsent("newId", 500);
        System.out.println("\n--- Map After putIfAbsent ---");
        System.out.println("Map: " + map);

        // Replace value for an existing key
        map.replace("id6", 999);
        System.out.println("\n--- Map After replace ---");
        System.out.println("Map: " + map);

        // Iteration using keySet
        System.out.println("\n--- Iterating using keySet ---");
        for (Object key : map.keySet()) {
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }

        // Iteration using values
        System.out.println("\n--- Iterating over values ---");
        for (Object value : map.values()) {
            System.out.println("Value = " + value);
        }

        // Iterate using entrySet
        System.out.println("\n--- Iterating with entrySet ---");
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Iteration using entrySet with Iterator
        System.out.println("\n--- Iterating using Iterator + entrySet ---");
        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Enumeration of keys (via Collections.enumeration)
        System.out.println("\n--- Enumeration over keys ---");
        Enumeration<Object> keys = Collections.enumeration(map.keySet());
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }

        // Iterate using forEach + lambda
        System.out.println("\n--- Iterating with forEach (Lambda) ---");
        map.forEach((key, value) -> System.out.println("Key => " + key + ", Value => " + value));

        // Clone the map (type-safe clone via cast)
        Map<Object, Object> clonedMap = new HashMap<>(map);
        System.out.println("\n--- Cloned Map ---");
        System.out.println("Map: " + clonedMap);

        // Clear all entries
        map.clear();
        System.out.println("\n--- Map After clear() ---");
        System.out.println("Map: " + map);
        System.out.println("Is Map Empty After Clear: " + map.isEmpty());
    }
}