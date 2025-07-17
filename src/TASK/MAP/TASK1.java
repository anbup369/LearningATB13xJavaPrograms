package TASK.MAP;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
1. Program: Word Frequency Counter Using HashMap

📘 Description:

Takes a sentence and prints how many times each word appears using HashMap.

Input: "java is easy and java is powerful"

*/
public class TASK1 {
    public static void main(String[] args) {

        //Getting Input from User
        String input = "java is easy and java is powerful";
        Freq_counter(input);

    }

    public static void Freq_counter(String input) {
        String[] words = input.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> inp = new HashMap<>();

        for (String item : words) {
            if (is_word(item)) {
                inp.put(item, inp.getOrDefault(item, 0) + 1);
            }
        }
        System.out.println("Character Frequency Map:");
        for (Map.Entry<String, Integer> entry : inp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    public static boolean is_word(String word) {
        for (char c : word.toLowerCase().toCharArray()) {
            // Ignore non-letter characters (e.g., %, $)
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

}
