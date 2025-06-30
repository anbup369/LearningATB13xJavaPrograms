package ex_06b_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Reading String
        System.out.println("Enter the String: ");
//        String s =  scanner.next();// use this if only onl word is required as input
        String s = scanner.nextLine(); //use this if multi-word is required as input
        System.out.println(s);

//      Reading Integer
        System.out.println("Enter the Int: ");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

//      Reading double
        System.out.println("Enter the Double: ");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);

//      Clear the leftover newline BEFORE prompting for new string input
        scanner.nextLine();


//      Reading String  again
        System.out.println("Enter the String again: ");
        String str = scanner.nextLine();
        System.out.println(str);

        scanner.close();


    }
}
