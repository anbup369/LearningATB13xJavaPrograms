package TASK.EXCEPTIONS;
/*
 Task 3: Try-Catch-Finally

 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[5] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
