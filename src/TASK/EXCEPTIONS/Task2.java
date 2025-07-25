package TASK.EXCEPTIONS;
/*
Task 2: Try-Catch with Multiple Catch Blocks

Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them with multiple catch blocks.

Expected Output:
Print which exception occurred.
 */
public class Task2 {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[5] / 0; // This line may throw both exceptions
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }


    }
}
