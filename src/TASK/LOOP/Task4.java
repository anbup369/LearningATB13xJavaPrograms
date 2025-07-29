package TASK.LOOP;

import java.util.Scanner;

/*
4.✅ Grade Calculator:

Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice = 'y';
        while (continueChoice =='y'){
            System.out.println("\"Enter the numerical score (0-100):\"");
            String score_as_string = scanner.nextLine().trim();

                if (score_as_string.isEmpty()) {
                    System.out.println("Entered score is invalid, Please enter valid score ");
                    continue;
                }
                int score = Integer.parseInt(score_as_string);
                gradeCalculator(score);
                System.out.println("Do you want to check grade for another score? (y/n):");
                continueChoice = scanner.next().toLowerCase().charAt(0);
                scanner.nextLine();

        }
        System.out.println("Thank you for using the Grade Calculator!");
        scanner.close();



    }

    private static void gradeCalculator(int score) {

        if (score >=90 && score <=100){
            System.out.println("Grade is: A");
        }else if (score >=80 && score <=89){
            System.out.println("Grade is: B");
        }else if (score >=70 && score <=79){
            System.out.println("Grade is: C");
        }else if (score >=60 && score <=69){
            System.out.println("Grade is: D");
        }else if (score >=0 && score <=59){
            System.out.println("Grade is: F");
        }else {
            System.out.println("Entered score is invalid, Please enter valid score ");

        }


    }
}
