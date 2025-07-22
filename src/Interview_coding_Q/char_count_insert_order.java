package Interview_coding_Q;

import java.util.LinkedHashMap;
import java.util.Map;

/*
I/p : pratikshakale

O/p: p-1, r-1, a-3, t-1, i-1, k-2, s-1, h-1, l-2, e-1
 */
public class char_count_insert_order {
    public static void main(String[] args) {
        String Input = "pratikshakale";

        count_char(Input);


    }

    private static void count_char(String Input) {
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : Input.toLowerCase().toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        System.out.println(count);
    }
}