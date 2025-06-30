package ex_06b_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        System.out.println(args[0]); //
        System.out.println(args[1]);
        System.out.println(args[2]);
//        System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException since passing three parameters but arg[10] is not passed
    }
}
