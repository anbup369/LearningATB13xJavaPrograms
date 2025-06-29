package ex_05_TypeCasting;

public class Lab057_TypeCasting_Implicit_Widening {
    public static void main(String[] args) {
        // Declare a byte variable
        byte b = 10;
        System.out.println("byte b is: "+b);
        System.out.println("Type of b: " + ((Object) b).getClass().getName());

        // Implicit widening: byte -> short
        short s = b;
        System.out.println("short s is: "+s);
        System.out.println("Type of s: " + ((Object) s).getClass().getName());

        // Implicit widening: short -> int
        int a = s;
        System.out.println("int a is: "+a);
        System.out.println("Type of a: " + ((Object) a).getClass().getName());

        // Implicit widening: int -> long
        long l = a;
        System.out.println("long l is: "+l);
        System.out.println("Type of l: " + ((Object) l).getClass().getName());

        // Implicit widening: long -> float
        float f = l;
        System.out.println("float f is: "+f);
        System.out.println("Type of f: " + ((Object) f).getClass().getName());

        // Implicit widening: float -> double
        double d = f;
        System.out.println("double d is: "+d);
        System.out.println("Type of d: " + ((Object) d).getClass().getName());
    }
}
