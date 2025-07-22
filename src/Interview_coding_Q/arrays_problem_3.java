package Interview_coding_Q;

import java.util.ArrayList;
import java.util.List;

/*
Write a program for below and take input from user and doesn't hard code any value

Input = {21,20,23,25,22,26,25}

Output = {22,26,25,21,20,23,25}
 */
public class arrays_problem_3 {
    public static void main(String[] args) {
        int[] Input = {21, 20, 23, 25, 22, 26, 25};
//       int[] Output = new int[Input.length];

        List<Integer> Rotated = new ArrayList<>(Input.length);
        System.out.println(Rotated);

        int rotate = 4;
        for (int j = 0; j < Input.length; j++) {

            Rotated.add(Input[(j + rotate) % Input.length]);
        }
        System.out.println(Rotated);

    }
}
