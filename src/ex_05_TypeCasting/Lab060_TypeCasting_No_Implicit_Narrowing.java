package ex_05_TypeCasting;
//  In Java, narrowing conversions are never implicit because they can lead to data loss


public class Lab060_TypeCasting_No_Implicit_Narrowing {
    public static void main(String[] args) {
        long phone = 9876543210L;
        System.out.println("long phone: " + phone);
        System.out.println("Type of phone: " + ((Object) phone).getClass().getName());
        // short s = phone; // Not allowed: implicit narrowing would cause compilation error

        short s1 = (short) phone; //  Explicit narrowing
        System.out.println("short s1: " + s1);
        System.out.println("Type of s1: " + ((Object) s1).getClass().getName());
    }
}