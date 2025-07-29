package TASK.ARRAYS;

public class Task2 {
    public static void main(String[] args) {
        // Define a square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int diagonalSum = 0;
        int seconddiagonalSum = 0;
        // Loop to calculate the sum of the main diagonal
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
            System.out.println(matrix[i][i]);
        }
        System.out.println("Sum of main diagonal elements: " + diagonalSum);

        // Loop to calculate the sum of the second diagonal
        for (int j = 0; j < matrix.length; j++) {
            seconddiagonalSum += matrix[j][matrix.length-1-j];
            System.out.println(matrix[j][matrix.length-1-j]);
        }
        System.out.println("Sum of second(Anti) diagonal elements: " + seconddiagonalSum);
    }

}
