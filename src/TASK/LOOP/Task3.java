package TASK.LOOP;

import java.util.Scanner;

/*
Task3.✅ Leap Year Checker:

Create a program that determines whether a given year is a leap year. A leap year is divisible by 4,
but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.


 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to find whether it is leap year or not:");
        int year = scanner.nextInt();

        isLeapYear(year);
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("\nEntered year " + year + " is leap year");
                } else {
                    System.out.println("entered year is not leap year");
                }
            } else {
                System.out.println("entered year" + year + " is leap year");
            }

        } else {
            System.out.println("\nentered year is not leap year");
        }
    }
}

