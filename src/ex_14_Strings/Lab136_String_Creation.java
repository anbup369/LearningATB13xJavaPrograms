package ex_14_Strings;
// String is non-primitive data type, it is immutable, it is also a class.

public class Lab136_String_Creation {
    public static void main(String[] args) {
        // String 2 ways
        String s1 = "pramod"; // String Constant Pool
        System.out.println(s1);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s1));
        String s2 = new String("pramod"); // OA -> Object Area
        System.out.println(s2);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s2));
        String s3 = new String("pramod"); // OA -> Object Area
        System.out.println(s3);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s3));
    }
}
