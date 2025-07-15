package ex_32_Collection_Framework_DSA.MAP;
// Using Hash Map to find Frequency of character in a Word.
import java.util.HashMap;
import java.util.Map;

public class CodingQuestion_FrequencyCounter_Char {
    public static void main(String[] args) {
        String input = "%programMing$";

        extracted(input);
    }

    private static void extracted(String input) {
        Map<Character, Integer> freqMap = new HashMap<>();

        // Convert input to lowercase and count character frequencies
        for (char c : input.toLowerCase().toCharArray()) {
            // p,r,o,g,r,a,m,m,i,n,g....
            // p : 1
            // r : 1
            // o : 1
            // g : 1
            // r : 1+1 - > 2
            // a : 1
            // m : 1
            // m : 1+1 - > 2
            // i : 1
            // n : 1
            // g : 1+1 -> 2


            // Ignore non-letter characters (e.g., %, $)
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//                System.out.println(freqMap); //for debugging to see freqMap.
            }
        }

        // Print character frequencies in {char=frequency} format
        System.out.println("Character Frequency Map:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}