package TASK.MAP;

import java.util.HashMap;
import java.util.Map;

/*
8. Program: Find Most Frequent Character in String

📘 Description:

Count frequency of characters and find the one with the highest count.

Input: "aaaabbbcc"

Output:  Most frequent character is: a (4 times)
 */
public class TASK8 {
    public static void main(String[] args) {
        String Input = "aaaabbbcc";
        Map<Character, Integer> freq_char_count = new HashMap<>();
        for (char c : Input.toCharArray()) {
            freq_char_count.put(c, freq_char_count.getOrDefault(c, 0) + 1);

        }


        System.out.println(freq_char_count);

        char mostFreqChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> item : freq_char_count.entrySet()) {
            if (maxCount < item.getValue()) {
                maxCount = item.getValue();
                mostFreqChar = item.getKey();
            }
        }
        System.out.println("Most frequent character is: " + mostFreqChar + " (" + maxCount + " times" + ")");
    }
}
