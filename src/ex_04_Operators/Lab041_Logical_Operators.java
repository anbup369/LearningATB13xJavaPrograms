package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;

        // NOT operator
        System.out.println("!a = " + !a);       // false
        System.out.println("!!a = " + !!a);     // true

        // OR operator
        boolean result_Or = a || b;
        System.out.println("a || b = " + result_Or); // true

        // AND operator
        boolean result_And = a && b;
        System.out.println("a && b = " + result_And); // false

        // Combined expression
        System.out.println("!(a && b) = " + !(a && b)); // true
    }

}
