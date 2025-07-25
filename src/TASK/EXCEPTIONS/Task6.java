package TASK.EXCEPTIONS;

/*
Task 6: Catch Specific vs Generic Exception

Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior.
 */
public class Task6 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int b = 20 / 0;
        } catch (
                ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
