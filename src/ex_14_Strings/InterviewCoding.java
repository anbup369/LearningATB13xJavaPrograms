package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        //step1: get string as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.println("Entered input string is: "+input);
        int length = input.length();
        System.out.println(length);
        //reverse the given string
        String reversed="";

        int i;
        for(i = length-1; i >= 0; i--)

        {
//            reversed =reversed+input.charAt(i);
            reversed += input.charAt(i);
            System.out.println(i);
            System.out.println(reversed);
        }
        System.out.println(reversed);

        //compare the input and revered string
        if (input.equalsIgnoreCase(reversed)){ //
            System.out.println("Entered string "+input+" is palindrome ");
        } else{
            System.out.println("Entered string "+input+" is not palindrome ");        }
        }
}
