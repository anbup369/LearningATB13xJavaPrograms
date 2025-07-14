package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab253_AL_Students {
    public static void main(String[] args) {

        // Create Student objects using constructor
        Student s1 = new Student("Amit", "1");
        Student s2 = new Student("Ritwik", "2");
        Student s3 = new Student("Shubham", "3");

        // Create a list to store Student objects
        List<Student> myStudents = new ArrayList<>();

        // Add Student objects to the list
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        // Display all students using the list's toString method
        System.out.println("Student list (via toString): " + myStudents);

        // Print details of individual students using custom method
        System.out.println("Details of Student 1:");
        s1.printDetails();

        System.out.println("Details of Student 2:");
        s2.printDetails();

        // You can also print s3’s details if needed
        // System.out.println("Details of Student 3:");
        // s3.printDetails();

        // Retrieve and print name and roll no using getter methods
        System.out.println("Accessing Student 1 info via getter:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());

        // Modify name and roll no using setter methods
        s1.setName("Amit Kumar");
        s1.setRollNo("101");

        System.out.println("Updated Student 1 info via setter:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
    }
}

class Student {

    private String name;
    private String rollNo;

    // Constructor to initialize Student object
    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter for name field
    public String getName() {
        return name;
    }

    // Setter to update name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNo field
    public String getRollNo() {
        return rollNo;
    }

    // Setter to update rollNo field
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    // Method to print detailed student info
    public void printDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }

    // Overriding toString for compact summary
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}