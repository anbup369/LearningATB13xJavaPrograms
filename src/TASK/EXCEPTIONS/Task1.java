package TASK.EXCEPTIONS;
/*
Task 1: Basic Try-Catch with ArithmeticException

Description:
Divide a number by zero and handle the exception.

Expected Output:
Catch ArithmeticException and print a friendly message.

 */
public class Task1 {
    public static void main(String[] args) {
int a = 10;
        try {
            int i = a / 0;

        } catch ( ArithmeticException e) {
            System.out.println("Div by Zero not allowed!");
        }
    }
}