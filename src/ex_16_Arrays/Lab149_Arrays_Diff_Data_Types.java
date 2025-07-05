package ex_16_Arrays;
// different types of array declaration , initialization and accessing array elements.
import java.util.Arrays;

// Array can store only same type of datatypes
// - int, double, char, String and boolean
public class Lab149_Arrays_Diff_Data_Types {


    public static void main(String[] args) {

        //byte array - The range of a byte is from −128 to 127. Commonly used in I/O streams, file reading, and network communication
        byte[] data = {10, 20, 30, 40, 50};
        System.out.println("Data: " + Arrays.toString(data));

        //short array - The range of short: −32,768 to 32,767. Ideal when memory is tight and values stay small.
        short[] ages = {21, 35, 45};
        System.out.println("Ages: " + Arrays.toString(ages));


        // Integer array
        int[] marks = {91, 90, 51, 100, 91, 92, 89}; // Declaration + Initialization
        //Printing array using Arrays.toString()
        System.out.println("marks: " + Arrays.toString(marks));
        //Printing specific element in array using index
        System.out.println("element at index [0] :" + marks[0]);
        System.out.println("element at index [6] :" + marks[6]);        //System.out.println(marks[10]); java.lang.ArrayIndexOutOfBoundsException

        //long array
        System.out.println();
        long[] distances = {123456789L, 987654321L, 555555555L};
        System.out.println("Distances: " + Arrays.toString(distances));

        //float array
        System.out.println();
        float[] percentages = {85.5f, 90.0f, 75.75f};
        System.out.println("Percentages: " + Arrays.toString(percentages));

        // Double array
        System.out.println();
        double[] prices = {19.99, 9.99, 4.99};
        //Printing array using Arrays.toString()
        System.out.println("Prices: " + Arrays.toString(prices));
        //Printing specific element in array using index
        System.out.println("element at index [0] :" + prices[0]);
        System.out.println("element at index [2] :" + prices[2]);


        // Character array
        System.out.println();
        char[] grades = {'A', 'B', 'C'};
        //Printing array using Arrays.toString()
        System.out.println("Grades: " + Arrays.toString(grades));
        //Printing specific element in array using index
        System.out.println("element at index [0] :" + grades[0]);
        System.out.println("element at index [2] :" + grades[2]);


        // String array
        System.out.println();
        String[] names = {"Alice", "Bob", "Charlie"};
        //Printing array using Arrays.toString()
        System.out.println("Names: " + Arrays.toString(names));
        //Printing specific element in array using index
        System.out.println("element at index [0] :" + names[0]);
        System.out.println("element at index [2] :" + names[2]);


        // Boolean array
        System.out.println();
        boolean[] passed = {true, false, true};
        //Printing array using Arrays.toString()
        System.out.println("Passed: " + Arrays.toString(passed));
        //Printing specific element in array using index
        System.out.println("element at index [0] :" + passed[0]);
        System.out.println("element at index [2] :" + passed[2]);




    }
}

