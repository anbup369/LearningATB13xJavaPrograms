package ex_16_Arrays;
// Reversing an array using different methods

import java.util.Arrays;

// Reversing an array using different methods
public class Lab155_Array_Reverse_different {
    public static void main(String[] args) {

        //Reversing array elements by printing , without affect actual array.
        int[] numbers = {1, 2, 3, 4, 5};
        // 5,4,3,2,1
        System.out.println("\nOriginal array printed in reverse order:");


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

        //Reversing array elements and storing in new array
        System.out.println("\n\nReversing Original array and storing in new array:");

        int[] reversed = new int[numbers.length];
        int j = 0;
        for (int k = numbers.length - 1; k >= 0; k--) {
            reversed[j] = numbers[k];
            j++;
        }
        System.out.println("Actual Array 'numbers':" + Arrays.toString(numbers));
        System.out.println("Reversed new Array 'reversed':" + Arrays.toString(reversed));

        //Array Reversal - / Two-pointer approach: swap elements from ends moving inward
        //Actual Array is revered and stored in same array
        System.out.println("\nReversing Original Array and storing in Original Array:");

        int first_index = 0;
        int last_index = numbers.length - 1;
        System.out.println("Actual Array 'numbers':" + Arrays.toString(numbers));
        while (first_index < last_index) {
            int temp = numbers[first_index];
            numbers[first_index] = numbers[last_index];
            numbers[last_index] = temp;
            first_index++;
            last_index--;
        }
        System.out.println("Reversed Array 'numbers':" + Arrays.toString(numbers));

    }
}
