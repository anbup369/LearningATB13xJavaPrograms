package ex_17_OOPs;

//Object can be created without reference
public class Lab168_Cats {
    Lab168_Cats() {
        System.out.println("DC - Main Class");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
        // c2.running();
        new Cat().running();//valid: object created without reference

    }
}

class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }
}


