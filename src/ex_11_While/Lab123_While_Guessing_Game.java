package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // Random =>  1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1; // 0 to 100
//        System.out.println(numberToGuess);


        Scanner scanner = new Scanner(System.in);
//        System.out.print("Guess a number between 1 and 100: ");


        int guess;
        int attempts = 0;

        while (true){
            System.out.print("Guess a number between 1 and 100: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Consume the invalid input
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if(guess < numberToGuess){
                System.out.println("Too low, try again");
            } else if( guess > numberToGuess){
                System.out.println("Too high, try again");
            }else{
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }




        }




    }
}
