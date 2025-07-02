package ex_14_Strings;
//intern() - This returns a reference to the string from the pool if it exists, otherwise adds it to the pool.
public class String_Intern {
    public static void main(String[] args) {
        String s3 = "hello";
        System.out.println(System.identityHashCode(s3));

//        String s2 = new String("hello"); for this s2 without using intern, create new object in OA.

        String s4 = new String("hello").intern();

        System.out.println(s4);
        System.out.println(System.identityHashCode(s4));

        //identityHashCode of S3 and S4 will be same, since using intern() uses string from SCP(String Constant Pool).
    }
}
