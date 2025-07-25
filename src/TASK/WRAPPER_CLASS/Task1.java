package TASK.WRAPPER_CLASS;

/*
Task 1: Autoboxing and Unboxing

Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).

Expected Output:

Primitive: 50

Wrapper: 50

Unboxed again: 50
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 50;
        System.out.println(a);
        Integer A = a;// Autoboxing

        System.out.println(A);
        int b = A;// Unboxing

        System.out.println(b);

    }
}
