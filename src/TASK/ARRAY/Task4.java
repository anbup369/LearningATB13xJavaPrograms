package TASK.ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

/*
4. Find an Element in ArrayList

📘 Description:
Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly. (you can use If Condition to check the Pune city and you can take the City name from User)

✅ Expected Output:

Pune is in the list.
 */
public class Task4 {
    public static void main(String[] args) {
        //creating Arraylist to store cities names
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        //Printing cities name
        System.out.println(cities+"\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City name to search: \n");
        String search = scanner.next();
        // Case-insensitive check
        boolean found = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search+" is in the list");
        } else {
            System.out.println(search+" is not in the list");

        }
    }
}
