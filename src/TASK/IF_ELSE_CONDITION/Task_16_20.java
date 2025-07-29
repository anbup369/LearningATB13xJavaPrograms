package TASK.IF_ELSE_CONDITION;
/*
Task 25th June 2025(if else programs)-16-20
 */

import java.util.Scanner;

public class Task_16_20 {

    // 16) Check if a Number is a Palindrome
    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("16. Enter a number to check palindrome:\n");
        int num = sc.nextInt();
        int original = num, reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }

    // 17) Check if a Number is an Armstrong Number
    public static void checkArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("17. Enter a number to check Armstrong:\n");
        int num = sc.nextInt();
        int original = num, result = 0;

        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }

    // 18) Check Loan Eligibility
    public static void checkLoanEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("18. Starting Loan Eligibility check:\n" );
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        boolean ageValid = (age > 0 && age >= 18 && age <= 80);
        boolean salaryValid = (salary > 0 && salary >= 30000);
        boolean creditValid = (creditScore > 0 && creditScore >= 650 && creditScore <= 850);

        if (ageValid && salaryValid && creditValid) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
            if (!ageValid) System.out.println("- Age must be between 18 and 80.");
            if (!salaryValid) System.out.println("- Salary must be at least ₹30,000.");
            if (!creditValid) System.out.println("- Credit Score must be between 650 and 850.");
        }
    }

    // 19) Electricity Bill Calculation
    public static void calculateElectricityBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("19. Starting Electrical Bill Calculator:\n");
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = 100 * 0.50 + (units - 100) * 0.75;
        } else if (units <= 300) {
            bill = 100 * 0.50 + 100 * 0.75 + (units - 200) * 1.20;
        } else {
            bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
        }

        System.out.printf("Total Bill: ₹%.2f%n", bill);
    }

    // 20) Bonus Calculation Based on Salary and Experience
    public static void calculateBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("20. Starting Bonus Calculator:\n");
        System.out.print("Enter Salary: ₹");
        double salary = sc.nextDouble();
        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt();
        double bonus = 0;

        if (years < 1) {
            bonus = 0;
        } else if (years <= 3) {
            bonus = 0.05 * salary;
        } else if (years <= 6) {
            bonus = 0.10 * salary;
        } else {
            bonus = 0.15 * salary;
        }

        System.out.printf("Bonus: ₹%.2f%n", bonus);
    }

    // Main method to test all functions
    public static void main(String[] args) {
        checkPalindrome();
        checkArmstrong();
        checkLoanEligibility();
        calculateElectricityBill();
        calculateBonus();
    }
}