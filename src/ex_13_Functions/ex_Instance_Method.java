package ex_13_Functions;

public class ex_Instance_Method {
     void greet(String name) {
        System.out.println("Hello, " + name);
    }

     void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        ex_Instance_Method test = new ex_Instance_Method();
        test.greet();
        test.greet("test");

    }


}

