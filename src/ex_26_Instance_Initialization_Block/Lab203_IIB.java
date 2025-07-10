package ex_26_Instance_Initialization_Block;
// two types of initialization blocks 1) static and 2) Instance Initialization block
public class Lab203_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created before running Constructor
    //```static will Runs once when the class is loaded, before object is created
    public static void main(String[] args) {
        A a1 = new A(); // only one static call
        A a2 = new A(); // IIB called twice, i.e for each object creation

    }

}

class A {
    A() {
        System.out.println("A Constructor call");
    }

    {
        System.out.println("Hi, I am IIB 1");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection - Opening a DB connection
        // read a csv, xlsx file
        // read json, xml - Reading config files (CSV, JSON, XML)
        // read a text file or env file - Reading environment variables
        //Logging setup
    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }

    static {
        System.out.println("Static"); //only one static call
    }
}

