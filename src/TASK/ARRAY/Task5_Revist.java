package TASK.ARRAY;

import java.util.ArrayList;
import java.util.LinkedList;

/*
5. Compare ArrayList vs LinkedList Performance

📘 Description (Updated with Hints):
In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.

You will:

Create two separate lists: one ArrayList and one LinkedList.



Add 100,000 numbers (from 0 to 99,999) to each list using a loop.



Use System.currentTimeMillis() to measure how much time it takes to add the elements.



Print the time taken for both lists.

 Hint :-

 :-  System.currentTimeMillis() gives you the current time in milliseconds.

 :-  Subtract the end time from the start time to get the duration.

 :-  You don’t need to print all the 100,000 numbers, just print the time taken.

✅ Expected Output:

ArrayList time: 8 ms

LinkedList time: 12 ms

 */


/*
Why Only the First One Shows Time
- The first operation takes slightly longer due to JVM warm-up and memory allocation, so the duration is measurable.
- The second operation runs in an already warmed-up JVM and may complete in less than 1ms, resulting in 0 duration.
- Switching the order (ArrayList first or LinkedList first) simply flips which one gets the benefit of the JVM warm-up.
- to solve this we can create warmup loop.

//Warmup Loop -The idea is to run similar operations that invoke JIT (Just-In-Time) compilation and memory allocation
before your actual timed code. This way, both ArrayList and LinkedList creation happens under warmed-up JVM conditions.
 */

public class Task5_Revist {

    public static void jvmWarmUp() {
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> warmUpList1 = new ArrayList<>();
            LinkedList<Integer> warmUpList2 = new LinkedList<>();
            for (int k = 0; k < 50000; k++) {
                warmUpList1.add(k);
                warmUpList2.add(k);
            }
        }
    }

    public static void main(String[] args) {
        // JVM Warm-up to trigger JIT optimizations


        jvmWarmUp();
        Array_list();
        linked_list();





    }

    private static void linked_list() {
        // LinkedList timing
        long startLinked = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int j = 0; j < 100000; j++) {
            linkedList.add(j);
        }
        long endLinked = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endLinked - startLinked) + " ms");
    }

    private static void Array_list() {
        // ArrayList timing
        long startArray = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endArray = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endArray - startArray) + " ms");
    }
}
