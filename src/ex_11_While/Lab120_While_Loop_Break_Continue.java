package ex_11_While;

public class Lab120_While_Loop_Break_Continue {
    public static void main(String[] args) {

        int i = 0;
        while (true) {
            if (i == 3) break;
            System.out.println(i);
            i++;
        }
        System.out.println();
        int j = 0;
        while (j < 5) {
            j++;
            if (j == 3) continue;
            System.out.println(j);
        }


    }
}
