package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab183_Multi_Level_Dynamic_Dispatch {
    public static void main(String[] args) {


        Son amit = new Son();
/*        Not Allowed
        - Son s1 = new Father();
        - Son s1 = new GrandFather();
        - Father f3 = new GrandFather(); */

        GrandFather g1 = new Son(); // Dynamic Dispatch -// superclass reference to subclass object
        g1.gf();
        g1.home();

        Father f2 = new Son();
        f2.home();

        GrandFather g2 = new Father();
        g2.home();



        // WebDriver driver = new ChromeDriver();




    }
}
