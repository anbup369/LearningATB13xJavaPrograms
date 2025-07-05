package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 3x3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) { // 0,1,2
            for (int j = 0; j < matrix[i].length; j++) { //0,1,2
//                System.out.print(matrix[i][j]+ " | ");// will print matrix
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
