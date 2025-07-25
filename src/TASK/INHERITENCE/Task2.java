package TASK.INHERITENCE;
/*
 Task 2: "Vehicle Constructor Chain"

 Description:

Create a class Vehicle with a constructor that prints "Vehicle is ready".
Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor. Create an object of Bike in the main method and observe constructor call order.


 */
public class Task2 {
    public static void main(String[] args) {
    new Bike();
    }
}

class Vehicle{
    Vehicle() {
        System.out.println("Vehicle is ready");

    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}