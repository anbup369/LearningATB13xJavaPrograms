package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_Use_Input_AL {
    public static void main(String[] args) {

        // Create ArrayLists to store user input for names and ages
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        // Scanner to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Control flag to allow repeated input
        String continueInput = "Y";

        // Loop continues until user decides to stop
        while (continueInput.equalsIgnoreCase("Y")) {

            // Input: Read and store name
            System.out.print("Enter the name: ");
            String name = scanner.next();
            names.add(name);

            // Input: Read and store age
            System.out.print("Enter the age: ");
            Integer age = scanner.nextInt();
            ages.add(age);

            // Clear leftover newline from nextInt()
            // This ensures the nextLine() reads the actual user input
            scanner.nextLine();

            // Prompt user to continue or stop
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();
        }

        // Output: Display all entered names
        System.out.println("\nNames Entered:");
        for (String name : names) {
            System.out.println(name);
        }

        // Output: Display all entered ages
        System.out.println("\nAges Entered:");
        for (Integer age : ages) {
            System.out.println(age);
        }

        // Close scanner to free system resources
        scanner.close();
    }
}