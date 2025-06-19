package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_6 {
    /*
    Number Classification

Write a program to check if a number is positive, negative, or zero.

**Requirements:**
- Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case

Input
15 -7 0

Output
15 is positive
-7 is negative
0 is zero

     */
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();

        if (user_input >0) { System.out.println(user_input+" is positive");
                           }
        else if (user_input <0)
            {System.out.println(user_input+" is negative");
             }
        else
            System.out.println(user_input + " is zero");
    }
}


//This code can be modified to get all 3 inputs at once, but for simplicity it is taking 1 input per execution