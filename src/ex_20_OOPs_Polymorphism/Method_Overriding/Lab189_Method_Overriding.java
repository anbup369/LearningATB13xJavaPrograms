package ex_20_OOPs_Polymorphism.Method_Overriding;

public class Lab189_Method_Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal {

    void sound() {
        System.out.println("Default Sound!");
    }

    void A() {
    }
}

class Dog extends Animal {

    @Override
//The @Override annotation in Java is used to indicate that a method is intended to override a method in a superclass.

    void sound() {
        System.out.println("Bark!!");
    }

    void methodOverLoad() {

    }

    void methodOverLoad(int a) {

    }


}