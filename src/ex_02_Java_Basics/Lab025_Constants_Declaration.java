package ex_02_Java_Basics;
//By convention, constant names are written in ALL_CAPS.
//The final keyword in Java ensures that once a variable is assigned, it can't be modified - called as constant

public class Lab025_Constants_Declaration {
    public static void main(String[] args) {
        final int AA = 10;
//        AA = 11; cannot reassign value to variable AA, since it is constant from above step
        System.out.println(AA);

        final float PI = 3.14f;


    }
}
