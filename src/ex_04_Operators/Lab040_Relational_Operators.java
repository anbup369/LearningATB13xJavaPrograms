package ex_04_Operators;
//Relational operators
public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        //Relational operators in Java are used to compare two values or expressions
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int age_mamitha = 33;
        int age_pramod = 34;

        // > Greater Than
        boolean c = age_pramod > age_mamitha;
        System.out.println("age_pramod > age_mamitha: " + c);

        // >= Greater Than or equal to
        boolean result = age_pramod >= age_mamitha;
        System.out.println("age_pramod >= age_mamitha: " + result);

        // < Less Than
        boolean lessThan = age_pramod < age_mamitha;
        System.out.println("age_pramod < age_mamitha: " + lessThan);

        // <= Less than or equal to
        boolean lessThanOrEqual = age_mamitha <= 33;
        System.out.println("age_mamitha <= 33: " + lessThanOrEqual);

        // == Equal to
        boolean isEqual = age_mamitha == 33; // 33 == 33
        System.out.println("age_mamitha == 33: " + isEqual);

        // != Not Equal to
        boolean notEqual = age_pramod != age_mamitha; // 34 != 33
        System.out.println("age_pramod != age_mamitha: " + notEqual);
    }
}
