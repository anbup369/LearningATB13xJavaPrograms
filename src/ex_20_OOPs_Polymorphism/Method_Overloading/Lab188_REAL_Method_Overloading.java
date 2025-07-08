package ex_20_OOPs_Polymorphism.Method_Overloading;

public class Lab188_REAL_Method_Overloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(3);
        h1.task(true);
        h1.task();
    }
}

class Home {

    void task() {
        System.out.println("Task void");
    }

    int task(int a) {
        System.out.println("Task return int a");
        return a;
    }

    boolean task(boolean a) {
        System.out.println("Task return boolean a");
        return false;
    }


}