package ex_06a_Ternary_Operator;

//Number Checker to find positive example of nested ternary operators
// Not handled - User Input, Input Validation,Floating-Point Numbers
public class Lab063_TO_Number_Checker {
    public static void main(String[] args) {
        int number = -5;
        // Is Number: positive or negative
        String result = number >= 0 ? (number == 0 ? "Zero: Neither Positive or Negative" : "Positive ") : "Negative";
        System.out.println(result);
    }
}
