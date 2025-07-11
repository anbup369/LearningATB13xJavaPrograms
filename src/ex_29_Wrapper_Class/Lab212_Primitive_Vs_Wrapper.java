package ex_29_Wrapper_Class;

public class Lab212_Primitive_Vs_Wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive data type

        // This is not Object
        // It will not have attribute or Behaviour

        // byte, short, int, long, float, double,char,boolean - we will avoid them now


        // We will use the Wrapper classes,
        // Byte, Short,Integer, Long, Double, Float, Character, Boolean

        Integer age = 65;  //Wrapper class

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());


    }


}
