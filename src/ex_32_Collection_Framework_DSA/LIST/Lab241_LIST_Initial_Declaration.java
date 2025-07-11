package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;


public class Lab241_LIST_Initial_Declaration {
    public static void main(String[] args) {
//        List l = new ArrayList(); // Dynamic Dispatch
//        ArrayList l = new ArrayList(); //no type safety since no generics and contains all type of data like string, int, boolean etc
        ArrayList<Object> l = new ArrayList<>();//using generics
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println("Printing Arraylist 'l':\n"+l);
    }
}
