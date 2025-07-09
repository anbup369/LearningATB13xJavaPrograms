package ex_23_OOPs_Super_this_Constructor_Chaining;

//Constructor chaining in Java is the process of calling one constructor from another constructor within the same class or from a parent class.
public class Lab194_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }

}

class GOD {
    public int gold = 100;

    void sound() {
        System.out.println("GOD!!");
    }

    GOD() {
        System.out.println("GOD DC");
    }
}

class Animal extends GOD {
    @Override
    void sound() {

        super.sound();
    }

    Animal() {
        super();
    }

    Animal(int a, int b) {
        System.out.println(a + b);
    }

    void test() {
        System.out.println(super.gold);
    }
}