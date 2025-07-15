package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab260_Map_All {
    public static void main(String[] args) {

        // Cannot instantiate Map directly as it's an interface
        // Map m1 = new Map(); // Invalid

        // HashMap does not maintain any specific order of elements
        Map<String, Object> m1 = new HashMap<>(20); // Initial capacity: 20
        m1.put("name", "pramod");
        m1.put("roll_no", 1);
        m1.put("phone", 987654321);

        System.out.println("HashMap Output (Unordered):");
        System.out.println(m1);
        System.out.println();

        // LinkedHashMap preserves the order in which elements were inserted
        Map<String, Object> m2 = new LinkedHashMap<>();
        m2.put("name", "pramod");
        m2.put("roll_no", 1);
        m2.put("phone", 987654321);

        System.out.println("LinkedHashMap Output (Insertion Order Preserved):");
        System.out.println(m2);
        System.out.println();

        // TreeMap automatically sorts entries by keys in natural order
        Map<String, Object> m3 = new TreeMap<>();
        m3.put("firstname", "pramod");
        m3.put("lastname", "dutta");
        m3.put("roll_no", 1);
        m3.put("phone", 987654321);

        System.out.println("TreeMap Output (Sorted by Key):");
        System.out.println(m3);
    }
}