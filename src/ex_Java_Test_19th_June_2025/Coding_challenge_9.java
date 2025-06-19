package ex_Java_Test_19th_June_2025;

import java.util.Scanner;

public class Coding_challenge_9 {
    /*
    Day of the Week (Switch Statement)

Create a program using switch statement to display the day of the week.

//**Requirements:**
//- Read a number (1-7) representing day of week
//- Use switch statement to print corresponding day name
//- Handle invalid input with default case

input
1 7 8
output
Monday
Sunday
Invalid day number
     */

    public static void main(String[] args) {
        //Get number between 1-7 from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1-7 to find day of week:");
        int number = scanner.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}
