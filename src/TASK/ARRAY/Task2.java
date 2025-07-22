package TASK.ARRAY;

import java.util.ArrayList;

/*
2. Remove an Element from ArrayList

📘 Description:
Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.

✅ Expected Output:

Names after removal:

[Amit, Suresh]
 */
public class Task2 {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");
        // Printing stored  names
        System.out.println("Names Stored: "+names);

        names.remove("Neha");
        // Names after removal
        System.out.println("Names after removal: "+names);
    }
}
