package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        // concatenation
//        The + operator is overloaded by the Java compiler to behave differently:
//        - String + String → Concatenation
//        - int + int → Arithmetic addition
//        - String + int or int + String → Coerces to String concatenation!

        String first_Name = "Pramod";
        String last_Name = "Dutta";

        int a = 10;
        int b = 10;

//        String + int or int + String → forces to String concatenation!

        System.out.println(first_Name + last_Name + a + b);
        System.out.println(a + b + first_Name + last_Name);
        System.out.println(a + first_Name + last_Name + (a + b));


    }
}
