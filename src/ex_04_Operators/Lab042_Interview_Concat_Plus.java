package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
        // concatenation
//        The + operator is overloaded by the Java compiler to behave differently:
//        - String + String → Concatenation
//        - int + int → Arithmetic addition
//        - String + int or int + String → Coerces to String concatenation!

        //String + String → Concatenation
        String first_Name = "Pramod";
        String last_Name = "Dutta";

        System.out.println(first_Name + last_Name);
//        System.out.println("Pramod" / "Dutta"); invalid cannot use /,* and -
//        System.out.println("Pramod" * "Dutta");
//        System.out.println("Pramod" - "Dutta");

        //int + int → Arithmetic addition
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // + -> behave differently with the data type.
        // + -> operator overloading

    }
}
