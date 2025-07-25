package TASK.EXCEPTIONS;
/*
Task 7: Handle Checked Exception using Try-Catch

Description:
Open a file using FileReader and handle FileNotFoundException using try-catch.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt"); // File may not exist
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}
