package ex_12_Do_While;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        //vowel --> 'a','e', 'i','o','u'
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entered character: ");

        String inputStr = scanner.nextLine();
        if (inputStr.isEmpty()) {
            System.out.println("You entered nothing!");
        } else {
            char input = inputStr.toLowerCase().charAt(0); //to handle Captial letters(using toLoverCase()) AEIOU and space(using nextLine()

            if (Character.isLetter(input)) {
                //Edge case if input is not char is  handled.
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                    System.out.print("Entered character:'" + input + "'" + " is Vowel");
                } else {
                    System.out.print("Entered character: '" + input + "'" + " is consonants");

                }
            } else {
                System.out.print("Entered character: '" + input + "'" + " is not a letter");
            }

        }
    }

//        switch (input) {
//            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
//            default -> System.out.println("consonants");}
}




