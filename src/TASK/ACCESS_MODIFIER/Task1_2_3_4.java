package TASK.ACCESS_MODIFIER;
/*
Program 1: Access parent class constructor using super()
Program 2: Access parent class method using super
Program 3: Access parent class variable using super
Program 4: Create a Program to Access the private access modifier

 */
public class Task1_2_3_4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

// Parent.java
class Parent {
    String message = "Hello from Parent class";

    public Parent() {
        System.out.println("Parent constructor called");
    }

    public void showMessage() {
        System.out.println("Parent method: " + message);
    }

    private String secret = "This is a private secret";

    public String getSecret() {
        return secret; // Accessing private variable via public getter
    }
}

// Child.java
class Child extends Parent {
    public Child() {
        super(); // Program 1: Access parent class constructor
        System.out.println("Child constructor called");
    }

    public void display() {
        super.showMessage(); // Program 2: Access parent class method
        System.out.println("Accessing parent variable: " + super.message); // Program 3
        System.out.println("Accessing private variable via getter: " + super.getSecret()); // Program 4
    }
}



