package ex_13_Functions;

public class Lab132_UserDefined_with_all_combination {
    // User Defined Functions.
    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type

    public static void main(String[] args) {

        // 1.Without Argument / Parameters and Without Return Type.
        wp_wr_greet();
        //  2. Without Parameters but With Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);
        //  3. With Parameters and Without Return Type ( 90% of this we will be using this type of function)
        greet_with_details("Arivu", 40, 200000);
        greet_with_details("Anand", 35, 120000);
        greet_with_details("Ram",20,50000);
        //  4. With Parameters and With Return Type
        int sum1 =  sum_of_two_numbers(12,15);
        int sum2 = sum_of_two_numbers(150, 300);
        int sum3 = sum_of_three_numbers(80, 50,9);
        int sum4 = sum_of_three_numbers(577, 232, 167);
        System.out.println("\nsum_of_two_numbers is: "+sum1);
        System.out.println("sum_of_two_numbers is: "+sum2);
        System.out.println("sum_of_three_numbers is: "+sum3);
        System.out.println("sum_of_three_numbers is: "+sum4);

        int result = Math.max(3,4); // This is built-in function , which comes under 4. With Parameters and With Return Type
        System.out.println("Max of 2 numbers  is: "+result);

    }


    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wp_wr_greet() {
        System.out.println(" -- Type 1 : Without Parameters Without Return Type -- ");
        System.out.println("Hi, How are you?");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("\n -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
        return "Hi, are you?";
    }


    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("\nYour name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    //  4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b,int c) {
        return a + b + c;
    }

}
