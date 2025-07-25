package TASK.EXCEPTIONS;
/*
 Task 8: Throw Exception and Catch It

 Description:
Manually throw an exception using throw new ArithmeticException() and catch it.
 */
public class Task8 {
    public static void main(String[] args) {

        try{
            throw new ArithmeticException("manual throw ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception:"+e.getMessage());
        }
    }
}
