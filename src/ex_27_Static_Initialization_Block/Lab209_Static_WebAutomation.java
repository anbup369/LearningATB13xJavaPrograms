package ex_27_Static_Initialization_Block;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);//output : "Chrome"

        Automation t2 = new Automation();
        System.out.println(t2.driver);//output : "Chrome"

        Automation t3 = new Automation();
        System.out.println(t3.driver);//output : "Chrome"

        t1.driver = "Firefox"; //changing in t1 changes in other t2 and t3
        System.out.println(t1.driver); //output : "Firefox"
        System.out.println(t2.driver);//output : "Firefox"
        System.out.println(t3.driver);//output : "Firefox"

    }
}

class Automation {
    static String driver = "Chrome";
}