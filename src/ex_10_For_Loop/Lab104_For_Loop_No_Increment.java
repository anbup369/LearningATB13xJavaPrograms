package ex_10_For_Loop;
//Since no increment, value of i is always 0, so it becomes infinite loop
public class Lab104_For_Loop_No_Increment {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ) {
            System.out.println("Hello");
        }
    }
}
