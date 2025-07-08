package ex_20_OOPs_Polymorphism.Method_Overriding;

public class Lab190_Method_Overriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();


        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();


        // Firefox ff = new ChromeTC(); Not relation


    }
}

class CommonToAll {
    void openBrowser() {
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll {

    @Override
        //The @Override annotation in Java is used to indicate that a method is intended to override a method in a superclass.
    void openBrowser() {
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll {
    @Override
        //The @Override annotation in Java is used to indicate that a method is intended to override a method in a superclass.
    void openBrowser() {
        System.out.println("Firefox will start!");
    }
}