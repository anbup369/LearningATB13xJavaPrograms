package TASK.EXCEPTIONS;
/*
Task 4: Nested Try-Catch

Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]); // Triggers ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index error - " + e.getMessage());
            }

            int a = 10;
            int b = 0;
            int result = a / b; // Triggers ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic error - " + e.getMessage());
        }
    }
}
