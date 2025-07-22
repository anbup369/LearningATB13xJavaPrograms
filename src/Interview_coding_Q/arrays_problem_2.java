package Interview_coding_Q;
//2) Print out the indices of duplicate elements in the array
import java.util.Map;


/*
2) Print out the indices of duplicate elements in the array

//int[] arr={1,1,4,5,7,4,6,1};
 */
//public class arrays_problem_2 {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 4, 5, 7, 4, 6, 1};
//        Map<Integer, Integer> full = new LinkedHashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            full.put(i, arr[i]);
//        }
//        System.out.println(full);
//
//
//        for (int i = 0; i < full.size(); i++) {
//            if (i != 0) {
//                if (arr[i] == arr[i - 1])
//                    continue;
//            }
//
//            for (int j = i + 1; j < full.size(); j++) {
//                if (full.get(i).equals(full.get(j))) {
//                    System.out.println("indices of duplicate elements" + j + " is: " + full.get(i));
//
//
//                }
//            }
//
//        }
//
//
//    }



//}

import java.util.*;

public class arrays_problem_2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 5, 7, 4, 6, 1};
        Map<Integer, List<Integer>> valueIndices = new HashMap<>();

        // Collect indices for each value
        for (int i = 0; i < arr.length; i++) {
            valueIndices.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }
        System.out.println(valueIndices);
        // Report duplicates
        for (Map.Entry<Integer, List<Integer>> entry : valueIndices.entrySet()) {
            List<Integer> indices = entry.getValue();
            if (indices.size() > 1) {
                System.out.println("Value " + entry.getKey() + " found at indices: " + indices);
            }
        }
    }
}