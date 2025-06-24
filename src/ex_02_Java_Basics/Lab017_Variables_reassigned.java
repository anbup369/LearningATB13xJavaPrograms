package ex_02_Java_Basics;

public class Lab017_Variables_reassigned {
    public static void main(String[] args) {
        int age = 76; // Step 1: age is assigned 76
        age = age+1;  // Step 2: age is now 77
        age = 76; // Step 3: age is reassigned back to 76

        System.out.println(age);
    }

}
