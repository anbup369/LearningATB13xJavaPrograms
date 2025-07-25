package TASK.INHERITENCE;
/*
 Task 1: "Animal Sound Simulator"

 Description:  (Single Inheritance + Method Call)

 Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow(). In the main method, call both methods using the Cat object.


 */
public class Task1 {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.meow();
        obj.makeSound();
    }
}


class Animal{
    void makeSound(){
        System.out.println("making animal sound");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("making meow sound");

    }
}