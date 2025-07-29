package TASK.IF_ELSE_CONDITION;
/*
Task 24th June 2025(if else programs) - 11-15.
 */

import java.util.Scanner;

public class Task_11_15 {

    // 11. Calculate Grade Based on Marks
    public static void calculateGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("11. Enter marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    // 12. Check if a Character is an Alphabet
    public static void isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("12. "+"'" + ch + "' is an alphabet character.");
        } else {
            System.out.println("12. "+"'" + ch + "' is NOT an alphabet character.");
        }
    }

    // 13. Check if a Number is Prime
    public static void isPrime(int number) {
        boolean prime = true;
        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("13. "+number + " is a prime number.");
        } else {
            System.out.println("13. "+number + " is NOT a prime number.");
        }
    }

    // 14. ATM Withdrawal Simulation
    public static void atmWithdrawal() {
        final int INITIAL_BALANCE = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("14. Enter amount to withdraw: ₹");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of ₹100.");
        } else if (amount > INITIAL_BALANCE) {
            System.out.println("Insufficient balance. Available: ₹" + INITIAL_BALANCE);
        } else {
            int updatedBalance = INITIAL_BALANCE - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Updated Balance: ₹" + updatedBalance);
        }
    }

    // 15. Check if a Triangle is Valid Based on Three Sides
    public static void isValidTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("15. Valid triangle.");
        } else {
            System.out.println("15. Invalid triangle.");
        }
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        calculateGrade();
        isAlphabet('G');
        isPrime(29);
        atmWithdrawal();
        isValidTriangle(3, 4, 5);
    }
}