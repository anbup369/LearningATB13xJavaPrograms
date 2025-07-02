package ex_13_Functions;

public class ex_Method_Overloading_static {


    public static void main(String[] args) {

        greet();
        greet("test");
        greet(3);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    static void greet() {
        System.out.println("Hello!");
    }
    static void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello!");
        }
    }

}


