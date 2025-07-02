package ex_11_While;

import java.util.Scanner;

public class Lab124_While_Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;         // Get the last digit
            reversed = reversed * 10 + digit; // Append it to reversed
            num = num / 10;              // Remove the last digit
        }
        reversed *= sign;

        System.out.println("Reversed number: " + reversed);
    }
}
