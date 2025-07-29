package TASK.LOOP;

import java.util.Scanner;
import java.util.Set;

/*
1. Count vowels and consonants in a String.  -pramod, → vowels - 2, consonants - 4

 */
public class Task1 {
    public static void main(String[] args) {
        //get input String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to count vowels and consonants:");
        String input = scanner.nextLine().toLowerCase().trim();
//        String input = "`! @ # $ % ^ & * ( ) _ - + = { } [ ]  \\ : ; \" ' < > , . ? / ~ ``abcdefghijklmnopqrstuvwxyz0123456789\n";
        vowels_consonants_counter(input);

        vowels_consonants_set(input);

        scanner.close();
    }
    //Method using set(characters) to check vowel
    private static void vowels_consonants_set(String input) {

        Set<Character> set = Set.of('a','e','i','o','u');
        int vowel_count=0;
        int consonants_count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)){
                if(set.contains(c)){
                    vowel_count++;

                }else{
                    consonants_count++;
                }
            }

        }

        System.out.println("\nvowel count is: " + vowel_count);
        System.out.println("\nconsonants count is: " + consonants_count);
    }

    //Method using indexOf(c) to check vowel
    private static void vowels_consonants_counter(String input) {
        int vowel_count = 0;
        int consonants_count = 0;
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                System.out.printf("\nskipping this character %c ,since it is not alphabets", c);
//            } else if  ((c=='a') || c=='e'||c=='i'||c=='o'||c=='u'){
            } else if ("aeiou".indexOf(c) != -1) {
//                System.out.printf("\n%c is vowel", c);
                vowel_count++;
            } else {
//                System.out.printf("\n%c is consonants", c);
                consonants_count++;
            }

        }
        System.out.println("\nvowel count is: " + vowel_count);
        System.out.println("\nconsonants count is: " + consonants_count);
    }



}
