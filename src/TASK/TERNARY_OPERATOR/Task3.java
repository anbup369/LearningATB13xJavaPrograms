package TASK.TERNARY_OPERATOR;

import java.util.Scanner;

/*
🔹Program 3: Grade Calculation Using Nested Ternary

  Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Getting Mark as input from User
        System.out.println("Enter Mark to Calculate Grade:");
        if (!scanner.hasNextInt()) {
            System.out.println("enter a valid number");
            return;
        } else {

            int mark = scanner.nextInt();
            String grade = calculateGrade(mark);
            System.out.println("Grade for given mark: " + mark + " is: " + grade);
        }
        scanner.close();
    }

    public static String calculateGrade(int mark) {
        return (mark >= 90) ? "A+" : (mark >= 75) ? "A" : (mark >= 60) ? "B" : (mark >= 40) ? "C" : "Fail";
    }
}
