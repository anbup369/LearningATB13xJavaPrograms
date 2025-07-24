package TASK.ACCESS_MODIFIER;
/*
Program 5: default (no modifier) access - same package only
Instructions:
Create a class Student with a method showDetails() without any access modifier (default).
In the same file or same package, create a class TestDefault(Task5)
In main(), create an object of Student and call the showDetails() method.
 */
public class Task5 {
    public static void main(String[] args) {
Student obj = new Student();
obj.showDetails();
    }
}

class Student{
    void showDetails(){
        System.out.println("printing showDetails");
    }

}

