package TASK.LIST;
/*
1. Add and Display Elements in ArrayList

📘 Description:
Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop.

✅ Expected Output:

Student List:

Dipak

Ravi

Sneha

Priya

Anjali

 */
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Add student names
        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Priya");
        students.add("Anjali");

        // Display the student list
        System.out.println("Student List:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
