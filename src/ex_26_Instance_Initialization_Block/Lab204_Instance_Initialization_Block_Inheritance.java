package ex_26_Instance_Initialization_Block;
// two types of initialization blocks 1) static and 2) Instance Initialization block

public class Lab204_Instance_Initialization_Block_Inheritance {
    public static void main(String[] args) {
        new B();
    }
}

class A1 {
    A1() {
        System.out.println("Super Class Constructor call");
    }

    {
        System.out.println("Hi, I am IIB 1 from  A1");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2 from A2");
    }

    {
        System.out.println("Hi, I am IIB 3 from A3");
    }

    static {
        System.out.println("1 - SIB");
    }


}

class B extends A1{
    B (){
//        super();
        System.out.println("Subclass Constructor call");
    }
    {

        System.out.println("Class B IIB runs after superclass IIB(Superclass IIBs run before subclass IIBs)");


    }

}