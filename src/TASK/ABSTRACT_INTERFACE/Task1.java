package TASK.ABSTRACT_INTERFACE;
/*
1. Animal Sound - Abstract Method Implementation

Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.

🔶 Expected Output:

 Dog barks

Cat meows

 */
public class Task1 {
    public static void main(String[] args) {
Animal obj1 = new Dog();
obj1.makeSound();
Animal obj2 = new Cat();
obj2.makeSound();
    }
}

abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}
