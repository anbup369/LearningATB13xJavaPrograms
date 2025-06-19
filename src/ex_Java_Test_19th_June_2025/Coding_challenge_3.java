package ex_Java_Test_19th_June_2025;

public class Coding_challenge_3 {
    /*Comparison and Logical Operators

Write a program that demonstrates comparison and logical operators.
Explanation:Program compares two numbers using various operators
**Requirements:**
- Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)
- Print boolean results with explanatory messages
input 10 5
output
a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
*/
    public static void main(String[] args) {
    int a = 10;
    int b = 5;

    // Comparison Operators
         System.out.println("a == b: "+(a==b));
         System.out.println("a > b: "+(a > b));
         System.out.println("a < b: "+(a < b));

    // Logical Operators

        System.out.println("(a > b) && (a > 0): "+((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): "+((a < b) || (a > 0)));
        System.out.println("!(a > b): "+!(a > b));
    }
}
