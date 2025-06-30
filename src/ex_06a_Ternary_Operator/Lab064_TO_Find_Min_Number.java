package ex_06a_Ternary_Operator;

// Min number finder between two number using ternary operator
//Not handled - user input
public class Lab064_TO_Find_Min_Number {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.min(x,y));

        // without handling equal numbers
        int min = x < y ? x : y;
        System.out.println(min);

        String result = x == y ? "Both numbers are equal" : (x < y ? "x is smaller" : "y is smaller");
        System.out.println(result);
    }
}
