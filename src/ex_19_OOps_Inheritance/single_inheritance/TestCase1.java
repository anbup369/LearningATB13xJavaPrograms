package ex_19_OOps_Inheritance.single_inheritance;


public class TestCase1 extends CommonToAll {

    void runningTC1(){
        System.out.println("---------------------------------------");
        startBrowser();
        System.out.println("TC1 is running");
        closeBrowser();
        System.out.println("---------------------------------------");
    }
}
