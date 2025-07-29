package TASK.LOOP;

import java.util.Scanner;

/*
2. Palindrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
 */
public class Task2 {

    public static void main(String[] args) {
        //Getting string from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter String to check whether it is Palindrome or not:");
        String input = scanner.nextLine();
        System.out.println("\nEntered String "+ "'"+input+"'"+" is Palindrome?: "+isPalindrome(input));


    }

    private static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length()-1;
        while(start< end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;

        }
        return true;
    }
}
