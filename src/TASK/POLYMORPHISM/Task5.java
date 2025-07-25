package TASK.POLYMORPHISM;

/*
Method Overloading
 Task 5: Find Maximum
Title: Find max using overloaded functions
Description: Create a class Utility with two methods named max():
max(int a, int b) returns the larger of two integers
max(int a, int b, int c) returns the larger of three integers
max(double a, double b) returns the larger of two decimal values Add method calls in main() to compare different types.
 */
public class Task5 {
    public static void main(String[] args) {
        Utility operation = new Utility();
        System.out.println(operation.max(1, 9));
        System.out.println(operation.max(89, 34, 100));
        System.out.println(operation.max(5.6, 8.9));
    }
}

class Utility {
    int max(int a, int b) {
        return ((a > b) ? a : b);

    }

    int max(int a, int b, int c) {

        return ((a > b ? (Math.max(a, c)) : (b > c) ? b : c));

    }

    double max(double a, double b) {
        return ((a > b) ? a : b);
    }
}