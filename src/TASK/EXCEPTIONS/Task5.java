package TASK.EXCEPTIONS;
/*
Task 5: Catch Using Exception (Generic Catch)

Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.
 */
public class Task5 {
    public static void main(String[] args) {


        try {
            String s = null;
            System.out.println(s.length()); // This throws NullPointerException
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }

        try {
            int result = 10 / 0; // Throws ArithmeticException
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }


    }
}
