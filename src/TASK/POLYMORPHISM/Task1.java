package TASK.POLYMORPHISM;
/*
Method Overloading
Task 1: Add Two Numbers
Title: Overload a method to add different types of numbers
Description: Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
The int version should add two integers.
The double version should add two decimal numbers. In the main method, call both versions to demonstrate how overloading works with data types.
 */
public class Task1 {
    public static void main(String[] args) {
    calculator oper = new calculator();
        System.out.println(oper.add(1,2));
        System.out.println(oper.add(1.1,1.2));
    }
}
class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return  a+b;
    }
}