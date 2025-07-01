package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_Elseif_Else {
    public static void main(String[] args) {
        // input : age = 23
        //  age < 18 ->  Minor
        //  18 <= age <= 64 ->  Adult
        // age > 65 -> Senior Citizen

//         int age = Integer.parseInt(args[0]);

        System.out.println("Enter the age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid input! Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("Minor!");
        } else if (age > 64) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Adult");
        }


    }
}
