package ex_03_Literals;

import java.util.Arrays;

public class Lab035_Non_Primitive_Literal {
    public static void main(String[] args) {
        // Primitive Data Type - Defined by Java Guys
        // // Max, Min, Size defined
        byte b = 10; // 1 Byte -> 8 Bits
        int age = 65; // 4 Byte -> 32 Bits
        System.out.println(b);
        System.out.println(age);
        // Non Primitive ( Defined by users) , Reference Data Types
        // No Size, max, min
        // Byte - 8 , Bits - 64
        String name = "Pramod"; // String is a bunch of char.
        System.out.println(name);
        int[] arrays_of_items = new int[10];
        System.out.println( Arrays.toString(arrays_of_items));
        // String, Arrays, Classes, enum...

        String s = null;
        System.out.println(s);
        // int age = null;

    }
}
