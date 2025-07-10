package ex_25_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        System.out.println("Creating Child object...");
        Child c1 = new Child();

        System.out.println("Calling money() method from Child:");
        c1.money();

        // Demonstrating polymorphism
        Father1 f1 = new Child(); //can also use: Father1 f1 = c1 but it will be same reference to c1;
        Father2 f2 = new Child(); //can also use: Father1 f2 = c1 but it will be same reference to c1;

        System.out.println("Calling money() via Father1 reference:");
        f1.money();

        System.out.println("Calling money() via Father2 reference:");
        f2.money();
    }
}

interface Father1 {
    void money(); // Declaration only
}

interface Father2 {
    void money(); // Declaration only
}

class Child implements Father1, Father2 {
    @Override
    public void money() {
        System.out.println("Child's implementation: Child owns Money!");
    }
}