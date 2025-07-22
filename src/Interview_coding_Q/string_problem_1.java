package Interview_coding_Q;
import java.util.*;
/*
Q.2 Then interviewer shared one online coding platform give the java codes:

Given a string of brackets, create a function to validate if the parentheses are balanced.
Examples:

Input: "({()})" ➡️ Output: True

Input: "({)]" ➡️ Output: False


 */

class string_problem_1 {
    public static void main(String[] args) {

        System.out.println("Program to validate , if the parentheses are balanced for a given string\n :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to check  :");
        String Input = scanner.next();//get input from user

        boolean Result = isBalancedMapStack(Input);
        System.out.println("Is Parentheses are balanced for a given string: "+Result);
    }
    public static boolean isBalancedMapStack(String s) {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        System.out.println(bracketPairs);
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (bracketPairs.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketPairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
