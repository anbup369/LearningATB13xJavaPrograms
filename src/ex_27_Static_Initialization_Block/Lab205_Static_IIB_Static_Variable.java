package ex_27_Static_Initialization_Block;

// Main class to test static initialization block and variable behavior
public class Lab205_Static_IIB_Static_Variable {

    public static void main(String[] args) {
        // Creating first object of class P
        P p1 = new P();

        // Creating second object of class P
        P p2 = new P();

        // Accessing static variable 'a' using class name
        System.out.println(P.a);  // Output: 10

        // Modifying static variable 'a' through object reference
        p1.a = 12;

        // Since 'a' is static, change is reflected across all references
        System.out.println(P.a);    // Output: 12
        System.out.println(p1.a);   // Output: 12
        System.out.println(p2.a);   // Output: 12

        // Modifying instance variable 'b' for each object
        p1.b = 24;
        p2.b = 34;

        // Instance variables are independent for each object
        System.out.println(p1.b);   // Output: 24
        System.out.println(p2.b);   // Output: 34
    }
}


// Class P demonstrates static and instance behaviors
class P {
    // Static variable 'a' shared among all instances
    static int a = 10;

    // Instance variable 'b' unique to each object
    int b = 10;

    // Static initialization block
    static {
        // Executes only once when the class is loaded
        System.out.println("Hi, this is called, because, class is loaded");

        // Typically used for initial setup like database connections, loading config, etc.
    }
}