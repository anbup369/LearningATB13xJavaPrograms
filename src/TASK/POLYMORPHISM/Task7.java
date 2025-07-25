package TASK.POLYMORPHISM;
/*
Method Overriding
 Task 7: Vehicle Start
Title: Demonstrate engine start behavior using overriding
Description: Create a base class Vehicle with a method start(). Create Bike and Car classes that override the start() method:
Bike prints "Kick start the bike"
Car prints "Turn the key to start the car" This shows how polymorphism works with method overriding.
 */
public class Task7 {
    public static void main(String[] args) {
Vehicle ops1 = new Bike();
Vehicle ops2 = new Car();

ops1.start();
ops2.start();
    }
}
class Vehicle{
    void start(){

    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("\nKick start the bike");
    }
}

class Car extends  Vehicle{
    void start(){
        System.out.println("\nTurn the key to start the car");
    }
}