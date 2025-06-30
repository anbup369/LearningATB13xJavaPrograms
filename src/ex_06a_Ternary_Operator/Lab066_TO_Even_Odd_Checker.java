package ex_06a_Ternary_Operator;

//EvenOddChecker - Not handled edge cases,since only for example using ternary operator.
public class Lab066_TO_Even_Odd_Checker {
    public static void main(String[] args) {
        int num = 13;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
