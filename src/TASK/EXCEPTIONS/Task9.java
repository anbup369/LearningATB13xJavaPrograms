package TASK.EXCEPTIONS;
/*
 Task 9: Try Block Without Exception

 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.
 */
public class Task9 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 11;
            int c = a+b;
            System.out.println("addition of a and b is: "+c);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Cleaning up after execution");
        }
    }
}
