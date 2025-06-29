package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR -->It returns true if at least one operand is true.

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //  &&  - AND -->It returns true only if both operands are true.

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

//        Java also supports short-circuiting:
//        - For ||: If the first operand is true, it skips checking the second.
//        - For &&: If the first operand is false, it skips the second.



    }
}
