package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab184_Multil_LEVLEL_upcasting_downcasting {
    public static void main(String[] args) {


        // Son s1 = new Father();
        //  Son s1 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);  // Accessing inherited field from GrandFather
        amit.gf(); // Calling inherited method from GrandFather


        //upcasting -  treat a subclass object as if it were an instance of its superclass. It’s automatic and safe, and it’s often used to simplify code and enable polymorphism.
        GrandFather grandFather = new Son(); // upcasting - a Son object is referenced by a GrandFather type.
        grandFather.home();// override method from son will get called instead of Grandfather


        //down casting -  converting a reference of a superclass type to a subclass type.
//        grandFather.s(); s() in Son() class not allowed since Only methods available in GrandFather can be called directly.
        ((Son) grandFather).s(); //down casting// You're explicitly casting that reference back to its actual type (Son) using:


    }
}
