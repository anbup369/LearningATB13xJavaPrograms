package TASK.TERNARY_OPERATOR;

import java.util.Scanner;

/*
🔹 Program 2: Check Even or Odd.

   Description: Uses ternary to check whether a number is even or odd. A = 19, update the value and check again A =20;
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //prompt user for input
        System.out.println("Enter a number to check even or odd:");
        int A = scanner.nextInt();

        String Result = evenOrOdd(A);
        System.out.println("Number "+A+" is: "+Result);
        //closing scanner
        scanner.close();
    }

    private static String evenOrOdd(int A) {
        //using ternary operator to find even or odd number
        return (A %2 ==0) ? "even" : "odd";
    }
}
