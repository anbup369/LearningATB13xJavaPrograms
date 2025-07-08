package ex_19_OOps_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();//Parent
        f1.home();//own method

        Ruhani r1 = new Ruhani();//child
        r1.r1();//own method
        r1.home();//inherited from Father class

        Pramod p1 = new Pramod();
        p1.h2();//own method
        p1.home();//inherited from Father class

        Lucky l1 = new Lucky();
        l1.l2();//own method
        l1.home();//inherited from Father class


    }
}

class Father {//parent

    void home() {
        System.out.println("F1 from Father 3BHK");
    }
}

class Pramod extends Father {//child of Father

    void h2() {
        System.out.println("h2 - from Pramod");
    }
}

class Lucky extends Father {//child of Father

    void l2() {
        System.out.println("l2 from Lucky");
    }
}

class Ruhani extends Father {//child of Father

    void r1() {
        System.out.println("r1 from Ruhani");
    }
}