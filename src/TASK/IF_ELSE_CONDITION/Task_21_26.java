package TASK.IF_ELSE_CONDITION;
/*
Task 25th June 2025(if else programs)-21-22
Task_27th June 2025(if else) - 23-26
 */
import java.util.Scanner;


public class Task_21_26 {

    // 21) Calculate Employee Net Salary
    public static void calculateNetSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("21. Net Salary Calculator:\n");
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        double hra = 0.10 * basic; // 10% HRA
        double da = 0.08 * basic;  // 8% DA
        double gross = basic + hra + da;
        double tax = 0.05 * gross; // 5% Tax

        double netSalary = gross - tax;

        System.out.println("Net Salary: " + netSalary);
    }

    // 22) Check Travel Eligibility
    public static void checkTravelEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("22. Travel Eligibility Calculator:\n");
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("22. Enter Visa Status (valid/invalid): ");
        String visa = sc.nextLine().toLowerCase();

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age >= 18 && visa.equals("valid")) {
            System.out.println("Person is eligible to travel.");
        } else {
            System.out.println("Person is NOT eligible to travel.");
        }
    }

    // 23) Check Divisibility by 5 and 11
    public static void checkDivisibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("23. Divisibility checker:\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is NOT divisible by both 5 and 11.");
        }
    }

    // 24) Convert Days into Years, Months, and Days
    public static void convertDays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("24. Days Converter:\n");
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int finalDays = remainingDays % 30;

        System.out.println(days + " days = " + years + " years, " + months + " months, and " + finalDays + " days.");
    }

    // 25) Determine Website Type
    public static void determineWebsiteType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("15. Website Classifier:\n");
        System.out.print("Enter website URL: ");
        String url = sc.nextLine().toLowerCase();

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("Network-related website");
        } else if (url.endsWith(".info")) {
            System.out.println("Informational website");
        } else {
            System.out.println("Unknown or other types of websites");
        }
    }

    // 26) Determine Age Category
    public static void determineAgeCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.print("26. Age Classification:\n");
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }
    }

    // Main method to test all functions
    public static void main(String[] args) {
        // You can call any method here to test
        calculateNetSalary();
        checkTravelEligibility();
        checkDivisibility();
        convertDays();
        determineWebsiteType();
        determineAgeCategory();
    }
}