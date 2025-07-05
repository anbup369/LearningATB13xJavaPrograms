package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Sort {
    public static void main(String[] args) {

        // Using java.util.Arrays to Sort elements in Array.

        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(" - - - - - - Sorting Using java.util.Arrays - - - - - -");

        System.out.println("Original Marks (unsorted):");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
//        System.out.println(marks); // Ref Address
        System.out.println();
        Arrays.sort(marks);// Sorting in ascending order

        System.out.println("Original Marks (sorted):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");

        }

        //Printing all Array elements as list(string representation)
        System.out.println("\nSorted Marks (as list):");
        System.out.println(Arrays.toString(marks)); //[51, 87, 90, 91, 100] The square brackets and commas are just part
        // of the string representation created by Arrays.toString(...)


        // Sorting elements without using Arrays.sort()
        System.out.println(" - - - - - - Sorting without Using java.util.Arrays - - - - - -");
        int[] rank = {51, 100, 91, 87, 90};

        for (int i = 0; i < rank.length - 1; i++) {
            for (int j = 0; j < rank.length - 1 - i; j++) {
                if (rank[j] > rank[j + 1]) {
                    // Swap
                    int temp = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (Bubble Sort):");
        for (int value : rank) {
            System.out.print(value + " ");
        }

    }
}
