package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multi_Level_inheritance {
    public static void main(String[] args) {

        System.out.println(" -- ");
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" -- ");
        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");
        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
        System.out.println(" -- ");

    }
}
