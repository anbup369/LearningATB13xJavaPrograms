package TASK.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
3. Program: Sort Map by Keys Using TreeMap

📘 Description:

Store data in HashMap, then transfer to TreeMap to sort by keys.

 Input: {"Ravi": 80, "Anjali": 95, "Dipak": 75}

Output:

Anjali = 95

Dipak = 75

Ravi = 80
 */
public class TASK3 {
    public static void main(String[] args) {
        Map<String, Integer> Student_Mark = new HashMap<>();
        Student_Mark.put("Anjali", 95);
        Student_Mark.put("Dipak", 75);
        Student_Mark.put("Ravi", 80);
        System.out.println(Student_Mark);

        // Method 1: Using TreeMap Constructor
        Map<String, Integer> Student_Mark_Sorted = new TreeMap<>(Student_Mark);
        System.out.println(Student_Mark_Sorted + "\n");
        System.out.println("Method 1: Using TreeMap Constructor\n");
        for (Map.Entry<String, Integer> item1 : Student_Mark_Sorted.entrySet()) {
            System.out.println(item1.getKey() + " = " + item1.getValue() + "\n");
        }

        // Method 2: Using putAll
        Map<String, Integer> Student_Mark_Sort = new TreeMap<>();
        Student_Mark_Sort.putAll(Student_Mark);
        System.out.println(Student_Mark_Sort + "\n");
        System.out.println("Method 2: Using putAll\n");
        for (Map.Entry<String, Integer> item2 : Student_Mark_Sort.entrySet()) {
            System.out.println(item2.getKey() + " = " + item2.getValue() + "\n");

        }


    }
}
