package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println("Arithmetic:");
        System.out.println(a + b);  // Addition
        System.out.println(a - b);  // Subtraction
        System.out.println(a * b);  // Multiplication
        System.out.println(b / a);  // Division
        System.out.println(b % a);  // Modulo (Modulus)

        System.out.println("\nRelational:");
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("\nLogical:");
        System.out.println((a < b) && (b > 15));  // true && true
        System.out.println((a > b) || (b > 15));  // false || true
        System.out.println(!(a > b));             // !false → true

        System.out.println("\nBitwise:");// Mostly not used in Automation.
        System.out.println(a & b);    // Bitwise AND
        System.out.println(a | b);    // Bitwise OR
        System.out.println(a ^ b);    // Bitwise XOR
        System.out.println(~a);       // Bitwise NOT
        System.out.println(b >> 1);   // Right shift
        System.out.println(a << 2);   // Left shift

        System.out.println("\nCompound Assignment:");
        int age = 10;
        age += 5;
        age *= 2;
        age -= 3;
        age /= 2;
        System.out.println("Final age: " + age);

        System.out.println("\nIncrement/Decrement:");
        int counter = 5;
        System.out.println("Counter: " + counter++);
        System.out.println("After post-increment: " + counter);
        System.out.println("Pre-increment: " + ++counter);
        System.out.println("Pre-decrement: " + --counter);

        System.out.println("\nTernary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}