package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_10 {
    /*
    Simple Calculator (Switch Statement)

Write a program to create a simple calculator using switch statement.

**Requirements:**
- Read two numbers and an operator (+, -, *, /)
- Use switch statement to perform the operation
- Handle division by zero
- Display the result

Input
15.5 4.5 +
10.0 0.0 /
8.0 2.0 %
Output
Result: 20.0
Error: Division by zero
Invalid operator

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter Second Number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter Operators +, -, *, /  %:");
        char number = scanner.next().charAt(0);

        switch (number)
        {
            case '+':
                double add = number1+number2;
                System.out.println("Addition of two numbers is: "+add);
                break;
            case '-':
                double sub = number1-number2;
                System.out.println("Subtraction of two numbers is: "+sub);
                break;
            case '*':
                double multi = number1*number2;
                System.out.println("Multiplication of two numbers is: "+multi);
                break;
            case '/':
                if (number2 !=0){
                    double div = number1/number2;
                    System.out.println("Division of two numbers is: "+div);
                }else {System.out.println("Error: Division by zero");}
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
