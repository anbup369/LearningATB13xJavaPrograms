package ex_03_Literals;

public class Lab033_Integer_Literals_All {
    public static void main(String[] args) {
        int age = 65; // 65
        System.out.println(age);
        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10
        System.out.println(binary_num);
        // Octal base? -> 8
        int octal = 0101;
        System.out.println(octal);
        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        System.out.println(hex); //this will print 64206
        System.out.printf("0x%x\n", hex);// this will print 0xface

    }
}
