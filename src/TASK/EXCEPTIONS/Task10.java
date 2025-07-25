package TASK.EXCEPTIONS;
/*
 Task 10: Try With Multiple Statements

 Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch.
 */
public class Task10 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; //  Throws ArithmeticException
            System.out.println("This will not be printed"); //  Skipped
            String s = "Hello";
            System.out.println(s.length()); //  Skipped
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }

    }
}
