package ex_32_Collection_Framework_DSA.LIST;

import java.util.Arrays;

// Normal Array, not a collection
public class Lab240_Array_limitations {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10]; // Fixed Size
        arr[0] = 12;
        // arr[1] = "pramod";

        // 1. Fixed Size
        // 2. Similar Data Type
        // Doesn't grow Automatically,
        // fewer elements -> wastage of memory.  100 - Size, only used 10, 90 are waste.
        //No Built-in Utilities for tasks like insertion/removal/shifting—you need to manually code those.
        System.out.println(Arrays.toString(arr));


    }
}
