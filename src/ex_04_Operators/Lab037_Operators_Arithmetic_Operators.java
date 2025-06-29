package ex_04_Operators;

public class Lab037_Operators_Arithmetic_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder
        System.out.println("Arithmetic Operators");
        int a = 20;
        int b = 3;
        float c = 3.00f;
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Division:"+(a/c));

        System.out.println("Modulus:"+(a%c));//if we want to get int output, can use (int) to convert from float to int for c
        System.out.println("Modulus:"+(a%b));
        System.out.println(a % b);

        System.out.println("a+b");
        System.out.println(a+c);
    }
}
