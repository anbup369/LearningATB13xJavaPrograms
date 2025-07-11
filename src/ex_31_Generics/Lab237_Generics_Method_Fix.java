package ex_31_Generics;

public class Lab237_Generics_Method_Fix {

    public static void main(String[] args) {
        display(3, 4);
        display(3.14, 4.45);
        display("pramod", "dutta");

        display(3, 4, 5);
        display(3.14, 4.45, 6.76);
        display("michael", "madhana", "kamarajan");

        display(3, "test");
    }

    static <T> void display(T a, T b) {
        System.out.println();
        printWithType(a);
        printWithType(b);
    }

    static <T> T display(T a, T b, T c) {
        System.out.println();
        printWithType(a);
        printWithType(b);
        printWithType(c);
        return null;
    }

    private static <T> void printWithType(T value) {
        System.out.println("Type: " + value.getClass().getSimpleName());
        System.out.println("Value: " + value);
    }
}