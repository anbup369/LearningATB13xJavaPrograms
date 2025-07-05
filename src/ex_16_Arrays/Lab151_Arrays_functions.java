package ex_16_Arrays;

import java.util.Arrays;
import java.util.List;


public class Lab151_Arrays_functions {
    public static void main(String[] args) {


        /* java.util.Arrays
        Arrays.sort(names);
        Arrays.asList(names);
        Arrays.binarySearch(names);
        Arrays.compare(names,names);
        Arrays.compareUnsigned();
        Arrays.copyOf();
        Arrays.copyOfRange();
        Arrays.deepEquals();
        Arrays.deepHashCode();
        Arrays.equals();
        Arrays.sort();
        Arrays.fill();
        Arrays.toString();
        Arrays.mismatch();
        Arrays.hashCode();
        Arrays.deepToString();
        Arrays.parallelSort();
        Arrays.parallelSetAll();
        Arrays.stream();
        Arrays.setAll();
        Arrays.spliterator();
*/
        //1. Compare Two Arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); // Output: true

        //2.Copy an Array
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3, 0, 0]

        //3. Copy of Range

        int[] original_r = {10, 20, 30, 40, 50};
        int[] subArray = Arrays.copyOfRange(original_r, 1, 4); // from index 1 to 3
        System.out.println(Arrays.toString(subArray)); // Output: [20, 30, 40]


        //4. Binary Search
        int[] numbers = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index); // Output: Index of 5: 2

        //5. Convert array to string
        int[] numbers_a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers_a)); // Output: [1, 2, 3, 4]

        //6. Sort an array
        int[] numbers_s = {5, 3, 8, 1};
        Arrays.sort(numbers_s);
        System.out.println(Arrays.toString(numbers_s)); // Output: [1, 3, 5, 8]

        //7. Fill an array - Fills all or part of an array with a specified value
        // Fill all
        int[] numbers_f = new int[5];
        Arrays.fill(numbers_f, 7);
        System.out.println(Arrays.toString(numbers_f)); // Output: [7, 7, 7, 7, 7]
        //Fill specific
        Arrays.fill(numbers_f, 1, 4, 3); // Fill index 1 to 3 with 3
        System.out.println(Arrays.toString(numbers_f)); // Output: [7, 3, 3, 3, 7]

        //8.Arrays asList
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println(fruitList); // Output: [Apple, Banana, Cherry]

    }
}
