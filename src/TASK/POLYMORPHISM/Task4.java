package TASK.POLYMORPHISM;
/*
Method Overloading
 Task 4: Greet User
Title: Greet users differently using overloading
Description: Create a class Greeter with the following methods:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!" This task teaches overloading based on the number of parameters.
 */
public class Task4 {
    public static void main(String[] args) {
        Greeter print = new Greeter();
        print.greet();
        print.greet("rayon");
        print.greet("rangarajan");
    }
}

class Greeter{
    void greet(){
        System.out.println("Hello!");
    }
    void greet(String name){
        System.out.printf("\nHello, %s!",name);
    }
}