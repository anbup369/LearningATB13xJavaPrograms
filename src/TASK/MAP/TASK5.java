package TASK.MAP;

import java.util.LinkedHashMap;
import java.util.Map;

/*
5. Program: Find First Non-Repeated Character
📘 Description:

Prints the first character that appears only once using LinkedHashMap.
Input:→"aabbccdeeff"

Output:→ First non-repeated character is: d
 */
public class TASK5 {
    public static void main(String[] args) {

        String input = "aabbccdeeff";
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }


        for (Map.Entry<Character, Integer> item : count.entrySet()) {

            if (item.getValue() == 1) {
                System.out.println("First non-repeated character is: " + item.getKey());
                break;
            }
        }

    }


}
