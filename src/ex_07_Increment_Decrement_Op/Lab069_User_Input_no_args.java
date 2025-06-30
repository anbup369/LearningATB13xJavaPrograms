package ex_07_Increment_Decrement_Op;

public class Lab069_User_Input_no_args {
    public static void main(String[] args) {
        String age_string = args[0];
        System.out.println(age_string); // throws index 0 out of bounds for length of 0
    }
}
