package ex_Java_Test_19th_June_2025;
import java.util.Scanner;

public class Coding_challenge_15 {
    /*
    Prime Number Finder

Write a program to find and print all prime numbers between 1 and 100 using loops.
💡 Explanation:Program finds and prints all 25 prime numbers between 1 and 100
**Requirements:**
- Use nested loops to check for prime numbers
- A prime number is divisible only by 1 and itself
- Print all prime numbers in the range 1-100
- Optimize the algorithm for better performance

Input
No input
Output
Prime numbers between 1 and 100: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
     */
    public static void main(String[] args) {

        int range = 100;

        System.out.println("Prime Numbers up to " + range + ":");
        for (int j = 2; j <= range; j++) {
            boolean is_Prime = true;

            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    is_Prime = false;
                    break;
                }
            }
            if (is_Prime) {
                System.out.print(j + " ");
            }
        }

    }
}

