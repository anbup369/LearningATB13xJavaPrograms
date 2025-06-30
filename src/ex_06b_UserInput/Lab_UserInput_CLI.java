package ex_06b_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {

        String age_string = args[0];//pass arguments from  run/debug configuration in intellij,
        // or can run from cmd like java file.java parameters
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);

    }
}
