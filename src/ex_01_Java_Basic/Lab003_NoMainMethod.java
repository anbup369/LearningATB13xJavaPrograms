package ex_01_Java_Basic;

public class Lab003_NoMainMethod {
    static {
        System.out.println("abc");
        System.exit(0); // Exit to prevent looking for main method

    }//cannot run this program since no main method
}
