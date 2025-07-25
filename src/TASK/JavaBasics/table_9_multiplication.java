package TASK.JavaBasics;
/*
10th June 2025
By using the concept of printf(), I want you to print the table of 9. without loop

9×1 = 9

9×2 = 18

9× 3 = 27

….
9× 10 = 90

System.out.printf("%d x %d",a,b);
 */
public class table_9_multiplication {
    public static void main(String[] args) {

                int a = 9;
                System.out.printf("%d x 1 = %d%n", a, a * 1);
                System.out.printf("%d x 2 = %d%n", a, a * 2);
                System.out.printf("%d x 3 = %d%n", a, a * 3);
                System.out.printf("%d x 4 = %d%n", a, a * 4);
                System.out.printf("%d x 5 = %d%n", a, a * 5);
                System.out.printf("%d x 6 = %d%n", a, a * 6);
                System.out.printf("%d x 7 = %d%n", a, a * 7);
                System.out.printf("%d x 8 = %d%n", a, a * 8);
                System.out.printf("%d x 9 = %d%n", a, a * 9);
                System.out.printf("%d x 10 = %d%n", a, a * 10);

    }
}
