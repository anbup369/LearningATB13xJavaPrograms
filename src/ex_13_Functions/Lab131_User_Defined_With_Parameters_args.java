package ex_13_Functions;
// function with parameters with and without return type
public class Lab131_User_Defined_With_Parameters_args {
    public static void main(String[] args) {
        int result = sum_of_number(3, 4);

        sum_of_number_no_return(3,5);

        System.out.println(result);
    }

    static int sum_of_number(int a, int b) {
        return a + b; //This function with parameters/arguments returns value
    }

    static void sum_of_number_no_return(int a, int b) {
        System.out.println(a+b); //This functions with parameters/arguments returns nothing
    }
}
