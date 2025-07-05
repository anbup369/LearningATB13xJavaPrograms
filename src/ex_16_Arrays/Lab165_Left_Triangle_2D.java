package ex_16_Arrays;

public class Lab165_Left_Triangle_2D {
    public static void main(String[] args) {

//        int n = 3;
//        for (int i = n; i >=1; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int n = 3;
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
