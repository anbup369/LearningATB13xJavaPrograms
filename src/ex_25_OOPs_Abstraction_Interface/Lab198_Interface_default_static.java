package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface_default_static {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10, 10);

        Square s1 = new Square();
        s1.getArea(3, 4);

        r1.complete();        // Output: This is possible !
        s1.complete2();       // Output: This is possible2 !
        Polygon.staticComplete(); // Output: Static F1 in interface allowed, complete
    }


}

class Rectangle implements Polygon {


    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Square implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Square -> " + length * breadth);
    }
}

interface Polygon {
    void getArea(int length, int breadth);

    //    void complete(){
//
//    }
    default void complete() {
        System.out.println("This is possible !");
    }

    default void complete2() {
        System.out.println("This is possible2 !");
    }

    static void staticComplete() {
        System.out.println("Static F1 in interface allowed, complete");
    }

}

abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }
}