package ex_06b_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);

        scanner.close();


    }
}
