package TASK.ARRAYS;


import java.util.Arrays;

/*
Write a Java Program to Transpose a Matrix

 */
public class Task1 {

    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int row = original.length;
        System.out.println("Transposing the matrix...");
        int col = original[0].length;
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = original[i][j];
            }

        }
        System.out.println(Arrays.deepToString(transpose));
    }


}
