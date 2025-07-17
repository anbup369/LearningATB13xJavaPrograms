package TASK.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
2. Program: Iterate Over HashMap in Three Ways

📘 Description:

Create a map with key-value pairs and iterate using:

entrySet()

keySet()

Iterator

Input: {"Name" -> "Dipak", "Role" -> "Tester", "Level" -> "Senior"}

Output

Name -> Dipak

Role -> Tester

Level -> Senior
 */
public class TASK2 {
    public static void main(String[] args) {
        Map<String, String> employee_data = new HashMap<>();

        employee_data.put("Name", "Dipak");
        employee_data.put("Role", "Tester");
        employee_data.put("Level", "Senior");
        System.out.println(employee_data);

        // Iteration using keySet()
        System.out.println("\nPrinting using keySet():");
        for (String item : employee_data.keySet()) {
            System.out.println(item + " -> " + employee_data.get(item));
        }

        // Iteration using Values()
        System.out.println("\nPrinting using Values():");
        for (String value : employee_data.values()) {
            for (Map.Entry<String, String> entry : employee_data.entrySet()) {
                if (entry.getValue().equals(value)) {

                    System.out.println(entry.getKey() + " -> " + value);
                }
            }
        }


        // Iteration using entrySet
        System.out.println("\nPrinting using entrySet():");
        for (Map.Entry<String, String> entry : employee_data.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iteration using entrySet with Iterator without Map.Entry
        Iterator<String> keyIterator = employee_data.keySet().iterator();
        System.out.println("\n--- Iterating using Iterator on keys ---");
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            String value = employee_data.get(key);
            System.out.println(key + " -> " + value);
        }

        // Iteration using entrySet with Iterator and Map.Entry
        System.out.println("\n--- Iterating using Iterator() + entrySet() ---");
        Iterator<Map.Entry<String, String>> iterator = employee_data.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }

        System.out.println("\n--- Accessing by Specific Keys ---");
        System.out.println("Name -> " + employee_data.get("Name"));
        System.out.println("Role -> " + employee_data.get("Role"));
        System.out.println("Level -> " + employee_data.get("Level"));
    }
}
