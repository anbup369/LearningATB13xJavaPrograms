package TASK.LIST;

import java.util.LinkedList;
import java.util.Collections;
/*
3. Reverse a LinkedList

📘 Description:
Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.

✅ Expected Output:

Reversed List:

[40, 30, 20, 10]
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        // Reverse in-place
        Collections.reverse(numbers);


        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i =numbers.size()-1;i >=0; i--){
//            System.out.println(numbers.get(i));
            reversed.add(numbers.get(i));
        }
        System.out.println(reversed);
    }
}
