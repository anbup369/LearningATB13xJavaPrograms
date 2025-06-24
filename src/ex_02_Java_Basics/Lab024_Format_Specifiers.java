package ex_02_Java_Basics;
//format specifiers! These are used with System.out.printf() or String.format() in Java for formatted output

public class Lab024_Format_Specifiers {
    public static void main(String[] args) {
        int i = 42;
        String s = "Java";
        float f = 3.1415f;
        boolean b = true;
        char letter = 'Z';
        //%n is a platform-independent newline character instead of \n
        System.out.printf("Integer: %d%n", i);       // %d for int, byte, short, long
        System.out.printf("String: %s%n", s);         // %s for string
        System.out.printf("Float: %.2f%n", f);        // %f for float/double (with 2 decimal places)
        System.out.printf("Boolean: %b%n", b);        // %b for boolean
        System.out.printf("Character value: %c%n", letter);  // %c for characters

    }
}
