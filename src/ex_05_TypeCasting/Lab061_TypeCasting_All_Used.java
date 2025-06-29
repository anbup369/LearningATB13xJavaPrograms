package ex_05_TypeCasting;

public class Lab061_TypeCasting_All_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;

        // Invalid: implicit narrowing is not allowed
        // int total = course + GST;

        // Explicit narrowing: float -> int
        int total1 = course + (int) GST;
        System.out.println("Value of total1 (explicit narrowing): " + total1);
        System.out.println("Type of total1: " + ((Object) total1).getClass().getName());

        // Implicit widening: int -> float during expression
        float total2 = course + GST;
        System.out.println("Value of total2 (implicit widening): " + total2);
        System.out.println("Type of total2: " + ((Object) total2).getClass().getName());

        // Explicit widening: though unnecessary, int cast to float
        float total3 = (float) course + GST;
        System.out.println("Value of total3 (explicit widening): " + total3);
        System.out.println("Type of total3: " + ((Object) total3).getClass().getName());

    }
}