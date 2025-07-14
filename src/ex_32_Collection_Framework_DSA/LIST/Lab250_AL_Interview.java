package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {

        //  Create a list to store student marks
        List<Integer> marks = new ArrayList<>();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        //  Print original list
        System.out.println("Original Marks: " + marks);

        //  Sort marks in ascending order using Collections.sort()
        Collections.sort(marks);
        System.out.println("Sorted (Ascending): " + marks);

        /*
         *  Quick Notes:
         * - Collection: Interface representing a group of objects (e.g., List, Set, Queue)
         * - Collections: Utility class with static methods to operate on collections
         */

        //  Sort marks in descending order using reverseOrder comparator
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Sorted (Descending): " + marks);
    }
}