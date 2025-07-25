package TASK.WRAPPER_CLASS;

/*
Task 2: Converting String to Primitive Using Wrapper

Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.

Expected Output:

Parsed number: 123
 */
public class Task2 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        System.out.println("Parsed number: " + number);

    }
}
