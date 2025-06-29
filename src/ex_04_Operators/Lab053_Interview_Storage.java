package ex_04_Operators;

public class Lab053_Interview_Storage {
    public static void main(String[] args) {
        //How many bits long and string takes
        long l = 10L; // 8 Byte, 64 Bits
//        long(primitive type) memory storage
//        - Size: Always exactly 8 bytes (64 bits).
//        - Fixed size: Doesn’t change regardless of the value stored.
//        - Efficient: Stored directly in memory or on the stack (depending on context).
        System.out.println(l);
        System.out.println(Long.BYTES);

        String s = "name";
        //String(complex object) memory storage
        //- Size: Varies depending on:- Number of characters.
        //- JVM implementation.
        //- Internal object overhead.
        System.out.println(s);

    }
}
