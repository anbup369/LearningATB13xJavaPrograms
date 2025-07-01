package ex_10_For_Loop;
// Infinite execution - loop runs foreve - Infinite loop
public class Lab102_For_No_Condition_Infinite_Loop{
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }

        // exit code 130 (Stop by Yourself-Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }
}
