package TASK.WRAPPER_CLASS;

/*
Task 3: Convert int to Integer using Autoboxing

📘 Description:
Declare an int, assign a value, and convert it to Integer using autoboxing.

📤 Expected Output:

Primitive value: 10

Wrapper object: 10
 */
public class Task3 {
    public static void main(String[] args) {
        int num = 10;           // Primitive int
        Integer boxedNum = num; // Autoboxing happens here

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + boxedNum);

    }
}
