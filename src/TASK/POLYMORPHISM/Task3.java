package TASK.POLYMORPHISM;
/*
Method Overloading
 Task 3: Multiply Numbers
Title: Multiply using overloaded methods
Description: Create a class MathOperations with two multiply() methods:
One takes two integers and returns the product
Another takes three integers and returns their product This helps students understand how Java distinguishes methods based on parameter count.
 */
public class Task3 {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.multiply(1,2));
        System.out.println(operations.multiply(1,2,3));
    }
}
class MathOperations{
    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }
}