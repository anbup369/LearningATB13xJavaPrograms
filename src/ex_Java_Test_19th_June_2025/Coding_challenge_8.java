package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_8 {

    /*
    Leap Year Checker

Write a program to check if a given year is a leap year.

**Requirements:**
- A year is leap if it's divisible by 4
- Exception: if divisible by 100, it's not leap unless also divisible by 400
- Use logical operators in conditions

input
2020 1900 2000
output
2020 is a leap year   -->💡 Explanation:2020 is divisible by 4 and not a century year
1900 is not a leap year 💡 Explanation:1900 is divisible by 100 but not by 400
2000 is a leap year💡 Explanation:2000 is divisible by 400

     */

    public static void main(String[] args) {

        //Get year as input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year to check leap year:");
        int year = scanner.nextInt();
//        System.out.println(year);

        //find leap year or not
        if (year%4==0 && ((year%100!=0) ||(year%400==0)))
        {        System.out.println(year+" is a leap year");
        }
        else { System.out.println(year+" is not a leap year");}
}}
