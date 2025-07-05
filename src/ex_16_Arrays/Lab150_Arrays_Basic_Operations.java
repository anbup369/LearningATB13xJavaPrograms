package ex_16_Arrays;

import java.util.Arrays;

public class Lab150_Arrays_Basic_Operations {
    public static void main(String[] args) {


        //1. Declaring and Creating Array

        //1.a 1st way to create the array
        int[] numbers = new int[5]; // creates an array of 5 integers, default values are 0
//        System.out.println(numbers);// this will only print reference not actual array
        System.out.println("numbers: " + Arrays.toString(numbers)); //this will print actual array toString for single dimension array

        //1.b  2nd way to create the array
        int[] marks = {1, 2, 3, 4, 5, 6};
        System.out.println("marks: " + Arrays.toString(marks));

        //2. Assigning/Modification of Elements to an Array - array is mutable

        numbers[0] = 10; // assigns 10 to the first element
        numbers[4] = 50; // assigns 50 to the last element
        System.out.println("numbers: " + Arrays.toString(numbers));
        //edge case
        //numbers[5] = 60; //  ArrayIndexOutOfBoundsException

        //3 Length of an array:
        System.out.println();
        System.out.println("Length of an array numbers[] is : " + numbers.length);  // Output: 5


        //4. Traversing the array with index
        System.out.println("== Traversing with regular for-loop ==");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array numbers[" + i + "] = " + numbers[i]);
        }

        //Or using enhanced for-loop:
        System.out.println("== Traversing with enhanced for-loop ==");
        for (int num : numbers) {
            System.out.println("print array : " + num);
        }

        // Printing array elements using for each loop creating index
        System.out.println();
        int index = 0;
        System.out.println("== Traversing with enhanced for-loop ==");
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(" arr [" + index + "] " + num);
            index++;
        }


    }
}
