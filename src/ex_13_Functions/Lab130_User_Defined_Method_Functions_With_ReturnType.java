package ex_13_Functions;
//Function without parameters but returns different datatype
public class Lab130_User_Defined_Method_Functions_With_ReturnType {
    public static void main(String[] args) {


        int return_int = return_int();
        System.out.println("return_int is: "+return_int);

        boolean return_boolean = return_boolean();
        System.out.println("return_boolean is: "+return_boolean);


        float return_float_pi_value = return_float_pi_value();
        System.out.println("return_float_pi_value is: "+return_float_pi_value);


        long return_long = return_long();
        System.out.println("return_long is: "+return_long);


        String return_String = return_String();
        System.out.println("return_String is: "+return_String);


    }

    // The following functions returns different type of datatypes like int, boolean,float,long and String without Parameters/arguments

    static int return_int(){
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10L;
    }

    static String return_String(){
        return "Pramod";
    }
}