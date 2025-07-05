package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array using Arrays.sort()

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
        // You find it without using the sort function.

        // Find second Largest number in an Array without using Arrays.sort()
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second highest value found.");
        } else {
            System.out.println("Second highest number is: " + secondMax);
        }

    }
}
