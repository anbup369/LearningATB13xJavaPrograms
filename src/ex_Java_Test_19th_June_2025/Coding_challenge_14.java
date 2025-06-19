package ex_Java_Test_19th_June_2025;
import java.util.Scanner;
public class Coding_challenge_14 {
    /*
    Star Pattern Printing

Create a program to print various star patterns using nested loops.

**Requirements:**
- Print a right triangle pattern of stars
- Print a pyramid pattern of stars
- Use nested loops for pattern generation
- Make patterns scalable based on input size

input
4
output
Right Triangle: * ** *** **** Pyramid: * *** ***** *******


     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Right Triangle
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Pyramid
        System.out.println("\n\nPyramid:");
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
