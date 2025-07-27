package TASK.TERNARY_OPERATOR;

import java.util.Scanner;

/*
🔹 Program 1: Find Max of Two Numbers using Ternary Operators.

                 Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to find max of two numbers.");
        System.out.println("Enter First Number:");
        if (!scanner.hasNextInt()) {
            System.out.println("Entered First Number is not Valid number");
            scanner.nextLine(); // Clear the invalid input from the buffer

            return;
        }
        int A = scanner.nextInt();
        scanner.nextLine();//Flush newline after valid nextInt()

        System.out.println("Enter Second Number:");
        if (!scanner.hasNextInt()) {
            System.out.println("Entered Second Number is not Valid number");
            scanner.nextLine(); // Clear the invalid input from the buffer

            return;

        }
        int B = scanner.nextInt();
        scanner.nextLine();//Flush newline after valid nextInt()

        int max = getMax(A, B);
        //Result : Printing Max number from two numbers
        System.out.println("Max of Two Number is: " + max);
        scanner.close();
    }

    private static int getMax(int A, int B) {
        //using ternary operator to find max of two numbers
        return (A > B) ? A : B;
    }
}
