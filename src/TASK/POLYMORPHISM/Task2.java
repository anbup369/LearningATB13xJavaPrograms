package TASK.POLYMORPHISM;
/*
Method Overloading
Task 2: Print Data
Title: Create a universal printer with overloading
Description: Create a class Printer with multiple printData() methods to handle different data types:
printData(String data)
printData(int data)
printData(float data) Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.
 */
public class Task2 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.printData();
        obj.printData(100);
        obj.printData("data");
    }
}
class Printer {
    void printData(){
        System.out.println("printingData without params");
    }
    void printData(int a){
        System.out.println("printingData with params a: "+a);
    }
    void printData(String a){
        System.out.println("printingData with praams String a: "+a);
    }
//    String printData(String b){ this clash with above method with string as param
//        return b;
//    }
}