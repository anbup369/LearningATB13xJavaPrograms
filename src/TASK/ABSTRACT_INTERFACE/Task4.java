package TASK.ABSTRACT_INTERFACE;

/*
4. Abstract vs Concrete Method

🔶 Objective:

Understand how abstract classes can contain both abstract methods (which must be implemented in the subclass) and concrete methods (which can be used as-is).

🔶 Steps to Create:

Create an abstract class Parent.

Define one abstract method void show().

Define one concrete method void display() that prints a message.

Create a class Child that extends Parent.

Implement the show() method inside Child.

In the main() method, create an object of Child and call both display() and show().

🔶Expected Output:

Concrete method in abstract class

Abstract method implemented

 */
public class Task4 {
    public static void main(String[] args) {
    Parent obj = new Child();
    obj.display();
    obj.show();
    }
}

abstract class Parent {
    abstract void show();
    void display(){
        System.out.println("Concrete method in abstract class");
    }

}

class Child extends Parent {
    void show(){
        System.out.println("Abstract method implemented");

    }
}