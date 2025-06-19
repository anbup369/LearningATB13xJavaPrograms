package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_7 {
    /*
    Find Largest of Three Numbers

Create a program to find the largest among three numbers using if-else statements.

**Requirements:**
- Read three integers from user input
- Use nested if-else or if-else if statements
- Handle cases where numbers might be equal

Input
15 27 19
10 10 8
Output
Largest number is: 27
Largest number is: 10

     */
    public static void main(String[] args) {

        //Get Three numbers as Input from User
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number one:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the number two:");

        int number2 = scanner.nextInt();

        System.out.println("Enter the number three:");

        int number3 = scanner.nextInt();
        System.out.println("Enter the numbers are :"+number1+" "+number2+" "+number3);

        //Find Largest of Three Numbers
        int largest_number;
        if (number1>=number2 && number1 >=number3)
        {largest_number = number1;}
        else if (number2>=number1 & number2 >=number3)
        {largest_number= number2;}
        else {largest_number=number3;}

        System.out.println("largest_number is :"+largest_number);
}
    }