package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Count_Vowels {
    public static void main(String[] args) {
        // Java Program to Count Vowels and Consonants
        // pramod -> a,i,e,o,u -> V- 2, C- 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input:");
        String input = scanner.next();
        // char cc = input.charAt(0);
        int vowels = 0;
        int consonants = 0;


        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }


        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);


    }
}
