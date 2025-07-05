package ex_16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        int[] a = {23, 43, 45, 67, 87, 90};
        //Find the target 67, give index ?
        int target = 67;
        for (int i = 0;i<a.length;i++) {
            if (target == a[i]) {
                System.out.println("element found: " + a[i]);

            }
        }

    }
}
