package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch_Day_Of_The_Week {
    public static void main(String[] args) {
//        enter a number between 1 and 7 and then displays the corresponding day of the week using a switch statement.
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed  and or non - integer -error


        Scanner scanner = new Scanner(System.in);


        //Get Input from User
        System.out.println("Enter the day 1 to 7:");
        //Input Validation
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number between 1 and 7.");
            scanner.close();
            return;
        }
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }


    }
}
