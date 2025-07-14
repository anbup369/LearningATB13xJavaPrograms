package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        //  Create the first list of fruits
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println("Fruits List 1: " + fruits1);

        //  Create the second list of fruits
        List<String> fruits2 = new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println("Fruits List 2: " + fruits2);

        //  Create a list of vegetables
        List<String> vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");
        System.out.println("Vegetables List: " + vegetables);

        //  Create a nested list to hold all the lists
        List<List<String>> all_fruits = new ArrayList<>();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);

        //  Print the entire nested list
        System.out.println("\nNested List (All Items):");
        for (int i = 0; i < all_fruits.size(); i++) {
            System.out.println("Group " + (i + 1) + ": " + all_fruits.get(i));
        }

        //  Access and print the third list (vegetables)
        System.out.println("\nThird Group (Vegetables): " + all_fruits.get(2));
    }
}