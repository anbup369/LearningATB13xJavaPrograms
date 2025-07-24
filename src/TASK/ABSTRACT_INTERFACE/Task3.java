package TASK.ABSTRACT_INTERFACE;

/*
Abstract Class with Constructor

Description: Show that abstract class can have constructor. Print message from constructor and method.

🔶Expected Output:

Abstract class constructor called

Method from abstract class
 */
public class Task3 {
    public static void main(String[] args) {
        // Instantiate subclass
        child test1 = new child();
        //call method from Abstract class
        test1.test();


    }
}

abstract class parent {
    // Constructor in abstract class
    parent() {
        System.out.println("from Abstract Class constructor ");
    }
   //Concrete method in abstract class
    void test() {
        System.out.println("Method from abstract class ");

    }
}

class child extends parent{

}

