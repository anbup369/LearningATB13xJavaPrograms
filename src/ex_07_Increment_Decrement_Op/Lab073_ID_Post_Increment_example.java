package ex_07_Increment_Decrement_Op;

public class Lab073_ID_Post_Increment_example {
    public static void main(String[] args) {
        int a = 10;
        int result = a++; //10
        System.out.println(a);// 11
        System.out.println(result); // 10

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 10
        //  7 |  11 | NA
        //  8 | NA | 10

    }
}
