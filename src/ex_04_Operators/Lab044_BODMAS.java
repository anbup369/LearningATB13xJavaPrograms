package ex_04_Operators;


public class Lab044_BODMAS {
    public static void main(String[] args) {
        System.out.println((int) (Math.pow(2, 3) + 12 / 4 - 1) * 2);
        // Math.pow(2, 3) → 8 (Order)
        // 12 / 4 → 3 (Division)
        // 8 + 3 → 11 (Addition)
        // 11 - 1 → 10 (Subtraction)
        // 10 * 2 → 20 (Multiplication)
    }
}