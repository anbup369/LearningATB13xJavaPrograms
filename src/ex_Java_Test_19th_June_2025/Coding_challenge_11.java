package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_11 {
    /*
    Print Numbers Using For Loop

Write a program to print numbers from 1 to N using a for loop.

**Requirements:**
- Read the value of N from user input
- Use for loop to print numbers from 1 to N
- Print numbers in a single line separated by spaces

input
5 10

output
1 2 3 4 5
1 2 3 4 5 6 7 8 9 10
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++)
        {
            System.out.print(i+" ");
        }
    }
}
