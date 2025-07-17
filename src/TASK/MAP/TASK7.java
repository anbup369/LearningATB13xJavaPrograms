package TASK.MAP;

import java.util.HashMap;
import java.util.Map;

/*
7. Program: Filter Students by Name Starting with 'A'

📘 Description:

Store roll numbers and names in a HashMap, print only those starting with 'A'.

Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}

Output:

101 -> Anjali

103 -> Aman
 */
public class TASK7 {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>(Map.of(101, "Anjali", 102, "Dipak", 103, "Aman", 104, "Ravi"));

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Anjali");
        map.put(102, "Dipak");
        map.put(103, "Aman");
        map.put(104, "Ravi");

        System.out.println("print only those starting with 'A'\n");

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getValue().toLowerCase().startsWith("a")) {
                System.out.println(item.getKey() + " -> " + item.getValue() + "\n");
            }
        }
    }
}
