package TASK.ABSTRACT_INTERFACE;
/*
5. Multiple Inheritance Using Interfaces

🔶 Objective:

Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.

🔶 Steps:

Create two interfaces: Printable and Showable.

Each interface should have a method: print() and show() respectively.

Create a class Document that implements both interfaces.

Implement both methods in the Document class.

In the main() method, create a Document object and call both methods.

🔶 Expected Output:

Printing Document

Showing Document
 */
public class Task5 {
    public static void main(String[] args) {
        Document obj = new Document();
        obj.print();
        obj.show();
    }
}

interface Printable{
     void print();
}

interface Showable{
    void show();
}

class Document implements Printable,Showable{
    public void print(){
        System.out.println("Printing Document");
    }
    public void show(){
        System.out.println("Showing Document");
    }

}