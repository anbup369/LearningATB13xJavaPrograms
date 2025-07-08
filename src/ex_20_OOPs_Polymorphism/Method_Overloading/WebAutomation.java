package ex_20_OOPs_Polymorphism.Method_Overloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
        b1.startBrowser();
    }
}


class Browser {

    void startBrowser() {
        System.out.println("Starting a default browser");
    }

    String startBrowser(String browser) {
        System.out.println("Starting browser " + browser);
        return browser;
    }


}