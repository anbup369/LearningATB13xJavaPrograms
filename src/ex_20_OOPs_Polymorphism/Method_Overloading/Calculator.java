package ex_20_OOPs_Polymorphism.Method_Overloading;

public class Calculator {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3, 4);
        c1.add(3.414, 4.56);
    }
}

class Calc {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }


}