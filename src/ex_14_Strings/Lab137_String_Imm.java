package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("Original identityHashCode: " + System.identityHashCode(s1));

        s1 = s1.concat("world"); // Concat, basically add the value or merge the value in the end.
        System.out.println(s1);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s1));

    }
}
