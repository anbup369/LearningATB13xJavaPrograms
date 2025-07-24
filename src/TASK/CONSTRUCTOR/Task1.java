package TASK.CONSTRUCTOR;
/*
Program 1 : What is a default constructor? Give one example, Write a code for that.
 */
public class Task1 {
    public static void main(String[] args) {
        Student s = new Student(); // invokes default constructor
        s.display();
    }
}

class Student {
    Student() {
        System.out.println("Default constructor called!");
    }

    void display() {
        System.out.println("Student details...");
    }


}