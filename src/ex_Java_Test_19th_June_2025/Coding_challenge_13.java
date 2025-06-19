package ex_Java_Test_19th_June_2025;

public class Coding_challenge_13 {
    /*
    Multiplication Table (Nested Loops)

Write a program to print multiplication tables using nested loops.

**Requirements:**
- Print multiplication tables for numbers 1 to 5
- Each table should show multiplications from 1 to 10
- Use nested for loops
- Format output clearly

Input

Output


     */

    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
        {   System.out.println("Tables for : "+i);
            int j;
            for(j=1; j<=10; j++)
            {
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
