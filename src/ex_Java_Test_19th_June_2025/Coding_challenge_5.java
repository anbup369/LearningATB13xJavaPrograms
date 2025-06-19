package ex_Java_Test_19th_June_2025;

public class Coding_challenge_5 {
    /*
Operator Precedence and Type Casting

Write a program that demonstrates operator precedence and type casting in Java.

**Requirements:**
- Show operator precedence with complex expressions
- Demonstrate implicit and explicit type casting
- Print results with explanations

Input
10 3.5
Output
Expression result: 23
Implicit casting: 13.5
Explicit casting: 13

     */
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;
       // Operation precedence - () first performed, then addition performed
        int expressionResult = a + (int)(a+b); // 3.5 * 10 = 13.5 → cast = 13 → 10 + 13 = 23

        // Implicit casting: int + double → result is double
        double implicitCast = a + b;

        // Explicit casting: truncate decimal by casting double to int
        int explicitCast = (int)(a + b);

        System.out.println("Expression result: " + expressionResult);
        System.out.println("Implicit casting: " + implicitCast);
        System.out.println("Explicit casting: " + explicitCast);
    }
}
