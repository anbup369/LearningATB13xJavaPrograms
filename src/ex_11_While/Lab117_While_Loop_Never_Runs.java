package ex_11_While;

public class Lab117_While_Loop_Never_Runs {
    public static void main(String[] args) {
        int i = 0;
        while (i > 0) { //never runs since condition not satisfied
            //
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
    }
}
