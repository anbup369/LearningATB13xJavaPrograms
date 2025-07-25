package TASK.SWITCH;
//equilateral triangle
import java.util.Scanner;

public class Classify_Switch_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the three sides
        System.out.print("Enter side A: ");
        double a = scanner.nextDouble();
        System.out.println("side A is: "+a);

        System.out.print("Enter side B: ");
        double b = scanner.nextDouble();
        System.out.println("side B is: "+b);

        System.out.print("Enter side C: ");
        double c = scanner.nextDouble();
        System.out.println("side C is: "+c);

        scanner.close();
        int d = ((a == b) && (b == c) && (c == a)) ? 1 : 0;

        switch (d) {
            case 1 :
                System.out.print("True");
                break;
            case 0 : System.out.print("False");
                break;

        }

    }
}