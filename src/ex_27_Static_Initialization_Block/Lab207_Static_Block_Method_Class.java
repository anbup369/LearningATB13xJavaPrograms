package ex_27_Static_Initialization_Block;

public class Lab207_Static_Block_Method_Class {
}

class B {

    static {
        System.out.println("SIB, called once, class is loaded");
    }

    int a = 10;
    static int b = 10;

    void display() {
        System.out.println(b);
        System.out.println("Non static F(n)");
    }

    static void commonToAll() {
//        System.out.println(a);
        System.out.println("Static F(n)");
    }

    static class C {
        // // Whatever you are going to use in the automation also. Good news.
    }
}