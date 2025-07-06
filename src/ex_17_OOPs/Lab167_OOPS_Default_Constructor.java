package ex_17_OOPs;

//default constructor
public class Lab167_OOPS_Default_Constructor {

    public static void main(String[] args) {
        Student s1 = new Student(); //Student class has Student Method same name,
        // so it will be automatically invoked when object is created

    }


}

class Student {
    String name;

    // is called as the default constructor, same name as the class name.
    Student() {
        System.out.println("DC");
    }


    void sleep() {
        System.out.println("Hi");
    }

}


class A {
}

class B {
}