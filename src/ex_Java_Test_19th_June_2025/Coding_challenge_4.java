package ex_Java_Test_19th_June_2025;

public class Coding_challenge_4 {
    /* Increment and Decrement Operators

Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
💡 Explanation:Program demonstrates increment and decrement operators
**Requirements:**
- Show the difference between ++i and i++
- Show the difference between --i and i--
- Print values before and after operations
input 5
output
Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)

using same 'original' for all operations below the output is different not as above

     */

    public static void main(String[] args) {

        int Original = 5;
        System.out.println("Original: "+Original);

        int Pre_increment = Original;
        System.out.println("Pre-increment: "+(++Pre_increment));
        System.out.println("returned: "+Original);
        int Post_increment=Original;
        System.out.println("Post-increment: "+(Post_increment++));
        System.out.println("returned: "+Post_increment);
        int Pre_decrement=Original;
        System.out.println("Pre-decrement: "+(--Pre_decrement));
        System.out.println("returned: "+Pre_decrement);
        int Post_decrement=Original;
        System.out.println("Post-decrement: "+(Post_decrement--));
        System.out.println("returned: "+Post_decrement);


    }
}
