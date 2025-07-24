package TASK.ACCESS_MODIFIER;
/*
Program 7: Demonstrate public Access Modifier
:- Understand how public methods are accessible from anywhere.
📝 Instructions:
Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
In the main() method, create an object of Student.
Call showInfo() directly from anywhere like same class, sub class, different class same package, in different package it should work without restriction.
 */
public class Task7 {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.showInfo();
    }
}

//Student1 from Student1.java