package ex_16_Arrays;

import java.util.Arrays;

public class LabArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println("Original Array: "+Arrays.toString(original));

        int[] copy = new int[original.length];
        System.out.println("before Copy Array: "+Arrays.toString(copy));
//      System.arraycopy to copy from Original Array
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println("Copy Array: "+Arrays.toString(copy));

    }
}
