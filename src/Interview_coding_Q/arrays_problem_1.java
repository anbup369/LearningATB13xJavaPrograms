package Interview_coding_Q;
//1) Finding common elements in two arrays
import java.util.ArrayList;
import java.util.List;

/*
1) Finding common elements in two arrays

String[] arr1={"one","two","five","nine","eight"};
    String[] arr2={"one","four","five","eight","ten"};

 */
public class arrays_problem_1 {

    public static void main(String[] args) {
        String[] arr1 = {"one", "two", "five", "nine", "eight"};
        String[] arr2 = {"one", "four", "five", "eight", "ten"};
        List<String> list = new ArrayList<>();

        for (String s : arr1) {
            for (String t : arr2) {
                if (s.equals(t)) {
                    list.add(s);

                }
            }
        }
        System.out.println(list);


    }
}
