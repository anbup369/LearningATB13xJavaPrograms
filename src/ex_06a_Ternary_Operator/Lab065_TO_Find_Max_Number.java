package ex_06a_Ternary_Operator;

public class Lab065_TO_Find_Max_Number {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        // without handling equal numbers
        int max = x > y ? x : y;
        System.out.println(max);

        String result = x == y ? "Both numbers are equal" : (x > y ? "x is Larger" : "y is Larger");
        System.out.println(result);
    }
}
