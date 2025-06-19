package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_12 {
    /*
    Factorial Calculator (While Loop)

Create a program to calculate factorial of a number using while loop.

**Requirements:**
- Read a positive integer from user input
- Use while loop to calculate factorial
- Handle edge case for 0! = 1
- Use appropriate data type to handle large results

Input
5 0 7
Output
Factorial of 5 is: 120
Factorial of 0 is: 1
Factorial of 7 is: 5040
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to calculate its factorial:");
        long number = scanner.nextInt();
        long Factorial = 0;

        if (number < 0) {
            System.out.println("Enter Positive Integer:");

        } else {
            Factorial = 1;

            while (number > 0) {
//                System.out.println("current value of number is:  "+number);
                Factorial *= number;
                --number;
            }

        }
        System.out.println("Factorial of "+number+" is: "+Factorial);
    }
}
