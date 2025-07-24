package TASK.ABSTRACT_INTERFACE;
/*
7. Interface Constants

🔶 Objective:

Demonstrate how to use constants (public static final variables) in interfaces.

🔶 Steps:

Create an interface SpeedLimit with a constant MAX_SPEED = 120.

In a class Car, access and print the constant.

Do not modify the constant—it should behave like a final value.

🔶 Expected Output:

Max Speed is: 120
 */
public class Task7 {
    public static void main(String[] args) {
        Car1 obj = new Car1();
        obj.Display();
    }
}

interface SpeedLimit{
    int MAX_SPEED = 120;
}

class Car1 implements SpeedLimit{
    void Display(){
        System.out.println("Max Speed is: "+MAX_SPEED);
    }

}