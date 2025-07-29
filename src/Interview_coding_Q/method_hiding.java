package Interview_coding_Q;
//Method Hiding
public class method_hiding {
    public static void main(String[] args) {

        SubClass.display(); // Outputs: Static method from SubClass
        SuperClass.display();// Outputs: Static method from SuperClass

        SuperClass obj = new SubClass();
        obj.display();// Outputs: Static method from SuperClass
        SubClass obj1 = new SubClass();
        obj1.display();// Outputs: Static method from SubClass

        //method hiding is only noticeable when calling via an object reference,
    }
}

class SuperClass {
    static void display() {
        System.out.println("Static method from SuperClass");
    }
}

class SubClass extends SuperClass {
    static void display() {
        System.out.println("Static method from SubClass");
    }
}


