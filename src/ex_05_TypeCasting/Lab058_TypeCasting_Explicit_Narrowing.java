package ex_05_TypeCasting;


public class Lab058_TypeCasting_Explicit_Narrowing {
    public static void main(String[] args) {
        // Start with a double
        double d = 123.456;
        System.out.println("double d is: " + d);
        System.out.println("Type of d: " + ((Object) d).getClass().getName());

        // Explicit narrowing: double -> float
        float f = (float) d;
        System.out.println("float f is: " + f);
        System.out.println("Type of f: " + ((Object) f).getClass().getName());

        // Explicit narrowing: float -> long
        long l = (long) f;
        System.out.println("long l is: " + l);
        System.out.println("Type of l: " + ((Object) l).getClass().getName());

        // Explicit narrowing: long -> int
        int a = (int) l;
        System.out.println("int a is: " + a);
        System.out.println("Type of a: " + ((Object) a).getClass().getName());

        // Explicit narrowing: int -> short
        short s = (short) a;
        System.out.println("short s is: " + s);
        System.out.println("Type of s: " + ((Object) s).getClass().getName());

        // Explicit narrowing: short -> byte
        byte b = (byte) s;
        System.out.println("byte b is: " + b);
        System.out.println("Type of b: " + ((Object) b).getClass().getName());
    }
}


