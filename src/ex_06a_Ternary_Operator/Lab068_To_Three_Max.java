package ex_06a_Ternary_Operator;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
//        int max = (n1> n2) ? A : B;
        //find max of three numbers
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        // A -> (n1 > n3) ? n1 : n3
        // B -> ( n2> n3) ? n2 : n3
        System.out.println(max);

        //find min of three numbers
        int min = (n1 < n2) ? (n1 < n3) ? n1 : n3 : (n2 < n3) ? n2 : n3;
        System.out.println(min);

        // Not  Handling Equal Numbers

    }
}
