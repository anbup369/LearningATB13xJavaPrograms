package ex_32_Collection_Framework_DSA.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Lab262_REAL_EXAMPLE {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Diwakar");
        student1.put("phone", "9876543210");  // Changed to String for consistency
        student1.put("address1", "Bangalore");
        student1.put("address2", 560021);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Lukcy");
        student2.put("phone", "96789876");
        student2.put("address1", "Delhi");
        student2.put("address2", 345);

        List<Map<String, Object>> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println("\n--- Student Details ---");
        for (Map<String, Object> student : students) {
            System.out.println("Name     : " + student.get("name"));
            System.out.println("Phone    : " + student.get("phone"));
            System.out.println("Address1 : " + student.get("address1"));
            System.out.println("Address2 : " + student.get("address2"));
            System.out.println("------------------------");
        }

        Set<String> book_read_items = new HashSet<>();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");  // Duplicate, will be ignored by Set
        book_read_items.add("Eat the Frog");

        System.out.println("\n--- Books Read ---");
        for (String book : book_read_items) {
            System.out.println("Book: " + book);
        }
    }
}