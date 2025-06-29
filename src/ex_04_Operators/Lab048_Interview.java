package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int balaji_salary = 12000;
        boolean b = !(balaji_salary > 10000 || balaji_salary < 5000);
        System.out.println(b);

        // A - balaji_salary > 10000 -> 12000 > 10000 -> true
        // B -> balaji_salary < 5000 ->  12000 < 5000 -> false
        // !(A || B) -> !(true || false) -> !true - false


    }
}
