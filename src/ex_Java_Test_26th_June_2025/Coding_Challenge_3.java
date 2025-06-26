package ex_Java_Test_26th_June_2025;

public class Coding_Challenge_3 {
    public static void main(String[] args ) {
//        StringBuilder vs StringBuffer Performance
//
//        Write a program that demonstrates the performance difference between String concatenation, StringBuilder, and StringBuffer for multiple string operations.
//                Examples:
//        Input:
//        1000 iterations
//        Output:
//        String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms //cannot get exact output but same difference is seen in results
//💡 Explanation:Program compares performance of different string manipulation methods
        int iterations = 80000;

        // Using String (immutable)
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "Hello World";
        }
        long endTime = System.nanoTime();
        long durationString = (endTime - startTime) / 1_000_000;
        System.out.println("String: " + durationString + "ms"); // 3843ms

        // Using StringBuilder (not thread-safe but faster)
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Hello World");
        }
        endTime = System.nanoTime();
        long durationSB = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuilder: " + durationSB + "ms"); //2ms

        // Using StringBuffer (thread-safe, slightly slower)
        startTime = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("Hello World");
        }
        endTime = System.nanoTime();
        long durationSBuf = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuffer: " + durationSBuf + "ms");//3ms

    }
}
