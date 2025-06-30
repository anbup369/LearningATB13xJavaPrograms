package ex_06a_Ternary_Operator;
//Age_Classification - Not handled edge cases,since only for example using ternary operator.

public class Lab067_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age = 36;
        String result = (age < 18) ? "Minor" : (age <= 64) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
