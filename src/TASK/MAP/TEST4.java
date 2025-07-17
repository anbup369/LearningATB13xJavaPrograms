package TASK.MAP;

import java.util.HashMap;
import java.util.Map;

/*
4. Program: Character Frequency Counter
 Description:
Count how many times each character appears in a string using HashMap.
Input:
"aabbccddeeff"

Output:
a -> 2
b -> 2
c -> 2
d -> 2
e -> 2
f -> 2
 */
public class TEST4 {
    public static void main(String[] args) {

        String Input = "aabbccddeeff";
        Map<Character, Integer> Freq_Counter = new HashMap<>();
        //Getting character count in HashMap
        for (char c : Input.toLowerCase().toCharArray()) {
            Freq_Counter.put(c, Freq_Counter.getOrDefault(c, 0) + 1);

        }
        //Printing Character frequencies using Map.Entry for loop
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> item : Freq_Counter.entrySet()) {
            System.out.println("\n" + item.getKey() + " -> " + item.getValue());
        }

    }
}
