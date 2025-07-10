package ex_27_Static_Initialization_Block;

// Main class to test static vs instance behavior
public class Lab206_Static_Instance_Method {
    public static void main(String[] args) {
        // Creating two objects of class A with different 'a' values
        A ref1 = new A(10);
        A ref2 = new A(11);

        // Printing values to observe how static and non-static behave
        System.out.println(ref1.a); // Output: 10 (instance variable from ref1)
        System.out.println(A.b);    // Output: 20 (static variable, shared)
        System.out.println(ref2.a); // Output: 11 (instance variable from ref2)

        // Static variables are shared, so they have same value across instances
        System.out.println(ref1.b); // Output: 20
        System.out.println(ref2.b); // Output: 20

        // Calling instance method which accesses both instance and static variables
        ref1.displayValue();        // Output: 10 and 20
        ref2.displayValue();        // Output: 11 and 20

        // Calling static method using class name
        A.staticMethod();           // Output: Message from static method
    }
}

// Class A demonstrates static and instance concepts
class A {
    int a;              // Non-static (instance) variable
    static int b = 20;  // Static variable shared by all instances

    // Constructor to initialize 'a'
    A(int a) {
        this.a = a;
    }

    // Instance method - can access both static and non-static members
    void displayValue() {
        System.out.println(this.a); // Accessing instance variable
        System.out.println(b);      // Accessing static variable
    }

    // Static method - can access only static members
    static void staticMethod() {
        System.out.println("I will be called when class is loaded");

        // The following line is invalid and commented out because 'this.a' is non-static
        // System.out.println(this.a);
    }
}