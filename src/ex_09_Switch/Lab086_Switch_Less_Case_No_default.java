package ex_09_Switch;

import java.util.Scanner;
//This program has less cases and no default case , since only two cases are available.
public class Lab086_Switch_Less_Case_No_default {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
