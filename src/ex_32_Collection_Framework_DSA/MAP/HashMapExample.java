package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store vehicle names and quantities
        Map<String, Integer> vehicles = new HashMap<>();

        // Add entries to the map
        vehicles.put("MG Astor", 1);
        vehicles.put("i10", 2);
        vehicles.put("Honda ACTIVA", 1);
        vehicles.put("BMW", 2);
        vehicles.put("TESLA", 5);

        // Duplicate key: overwrites the previous value
        vehicles.put("TESLA", 10);

        // Uncommenting below line will cause a compile-time error due to non-String key
        // vehicles.put(234,"dasda");


        // Display total number of unique keys in the map
        System.out.printf("Total Vehicles: %d%n%n", vehicles.size());

        // Iterate through map keys and print each key-value pair
        System.out.println("Vehicle List:");
        for (String key : vehicles.keySet()) {
            System.out.printf("%-15s : %d%n", key, vehicles.get(key));
        }
        System.out.println();

        // Check if a specific key exists in the map
        if (vehicles.containsKey("Audi")) {
            System.out.println("Audi is available in the map.");
        } else {
            System.out.println("Audi is not available in the map.");
        }

        // Clear all entries from the map
        vehicles.clear();
        System.out.printf("%nAfter clear operation, size: %d%n", vehicles.size());
    }
}