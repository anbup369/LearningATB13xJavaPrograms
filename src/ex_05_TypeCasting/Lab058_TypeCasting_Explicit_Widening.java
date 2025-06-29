package ex_05_TypeCasting;


public class Lab058_TypeCasting_Explicit_Widening {
    public static void main(String[] args) {
        byte b = 10;

        // Implicit widening: byte -> int
        int a = b;
        System.out.println("Value of a (implicit): " + a);
        System.out.println("Type of a: " + ((Object) a).getClass().getName());

        // Explicit widening (unnecessary but valid): byte -> int
        int a1 = (int) b;
        System.out.println("Value of a1 (explicit): " + a1);
        System.out.println("Type of a1: " + ((Object) a1).getClass().getName());
    }
}
