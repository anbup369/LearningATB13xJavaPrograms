package ex_14_Strings;
// String is non-primitive data type, it is immutable, it is also a class.
public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // "Pramod" created in String Constant Pool
        System.out.println(name);
        System.out.println("Original identityHashCode: " + System.identityHashCode(name));
//        name.toUpperCase();
        name = name.toUpperCase(); // PRAMOD created in String Constant Pool
        System.out.println(name);
        System.out.println("Original identityHashCode: " + System.identityHashCode(name));

        name = "Pramod"; // Pramod
        System.out.println(name);// "Pramod" used from already created in String Constant Pool
        System.out.println("Original identityHashCode: " + System.identityHashCode(name));
    }
}
