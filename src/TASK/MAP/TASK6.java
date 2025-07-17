package TASK.MAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
6. Program: Group Words by Length Using Map

📘 Description:

Group words based on their length using Map<Integer, List<String>>.

Input: ["Java", "is", "fun", "cool", "Hi"]

Output:

 2 -> [is, Hi]

3 -> [fun]

4 -> [Java, cool]
 */
public class TASK6 {
    public static void main(String[] args) {
        String[] Input = {"Java", "is", "fun", "cool", "Hi"};
        Map<Integer, List<String>> length = new TreeMap<>();
        for (String item : Input) {
//            length.computeIfAbsent(item.length(), k -> new ArrayList<>()).add(item);
            length.computeIfAbsent(item.length(), k -> new ArrayList<>()).add(item);//computeIfAbsent to avoid loss of value due to duplicate key

        }

        for (Map.Entry<Integer, List<String>> test : length.entrySet()) {
            System.out.println(test.getKey() + " -> " + test.getValue() + "\n");
        }
    }
}
