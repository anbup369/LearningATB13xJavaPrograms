package ex_10_For_Loop;
//this loop never runs ->loop executes 0 times
public class Lab101_For_Loop_No_execution {
    public static void main(String[] args) {
        for (int i = 0; i > 1 ; i++) {
            System.out.println(i);
        }
        System.out.println("End");
    }
}
