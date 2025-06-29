package ex_04_Operators;
// characters act as integer, since it is taking ASCII values
public class Lab054_Interview_Character_Integer {
    public static void main(String[] args) {
        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1); // Output: 131
        System.out.println("" + a1 + b1); // Output: AB
    }
}
