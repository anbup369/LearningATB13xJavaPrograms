package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer!");
            return;
        }

        int number = scanner.nextInt();

        long factorial = 1;

        if (number > 20) {
            System.out.println("Warning: Factorial of large numbers may overflow!");
            return;
        }

        if (number < 0) {
            System.out.println("Negative Factorial is not allowed!");
            return;
        }

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial


    }
}


// To show how factorial is calculated like 5*5*3*2*1 = 120
//System.out.print(number + "! = ");
//for (int i = number; i >= 1; i--) {
//        System.out.print(i);
//    if (i > 1) System.out.print(" * ");
//
//        System.out.println(" = " + factorial);