package ex_12_Do_While;

public class Lab126_Diff_While_Do_while {
    public static void main(String[] args) {
        int a = -10;

        while(a<0){
            System.out.println("I am in  while loop");
            System.out.println(a);
            a++;
        }

        do {
            System.out.println("I am in do while loop");
            System.out.println(a);
            a++;

        } while (a < 0);


    }
}
