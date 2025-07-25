package TASK.LIST;

import java.util.LinkedList;

/*
6. Insert in Middle of LinkedList

📘 Description:
Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.

✅ Expected Output:

Fruits List: [Apple, Orange, Banana, Mango]
 */
public class Task6 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.add(1,"Orange");
        System.out.println(fruits);
    }
}
