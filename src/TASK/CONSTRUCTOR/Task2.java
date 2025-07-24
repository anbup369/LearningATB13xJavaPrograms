package TASK.CONSTRUCTOR;
/*
Program 2: How do you create a parameterized constructor? Give one example, Write a code for that.
 */
public class Task2 {
    public static void main(String[] args) {
        Student_data s = new Student_data("dr strange", 51); // invoking parameterized constructor
        s.display();
    }
}

class Student_data {
    String name;
    int age;

    Student_data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


}