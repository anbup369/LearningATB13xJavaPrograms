package ex_19_OOps_Inheritance.hybrid;

//hybrid inheritance is not possible in Java class, but in interface it is possible,
public class Lab186_Hybrid {
    public static void main(String[] args) {
        GrandFather GF = new GrandFather();
        GF.home1();
        Father F = new Father();
        F.home2();
        Mother M = new Mother();
        M.home3();


    }
}

class GrandFather {
    void home1() {
        System.out.println("From Grand Father");
    }

}

class Father extends GrandFather {
    void home2() {
        System.out.println("From Father");
    }

}

class Mother extends GrandFather {
    void home3() {
        System.out.println("From Mother");
    }

}

//Multiple Inheritance not possible, comment below code for the same.

// class Son extends Mother, Father{}  -- this is not possible using class, but using interface it is possible.