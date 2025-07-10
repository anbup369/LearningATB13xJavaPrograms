package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {

    public static void main(String[] args) {
        // Father f1 = new Father(); // This is abstract in nature.
        Child child = new Child();
        child.loan50K();
        child.loan25K();
        Father f2 = new Child(); // Dynamic Dispatch.
        f2.loan50K();
        f2.loan25K();
    }

}

abstract class Father {
    // This is called the abstract function.
    abstract void loan50K();

    // as a complete function
    void loan25K() {
        System.out.println("Given the 25K");
    }
}

class Child extends Father {

    @Override
    void loan50K() {
        System.out.println("Son has to give the 50k loan");
    }
}