package ex_16_Arrays;

import java.util.Arrays;

public class Lab161_2D_p0 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] martix_2_2 = {{1, 2}, {3, 4}};
        int[][] martix_3_1 = {{1}, {3}, {5}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(martix_2_2));
        System.out.println(Arrays.deepToString(martix_3_1));
    }
}
