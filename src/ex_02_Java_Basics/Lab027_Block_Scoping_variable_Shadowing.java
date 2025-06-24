package ex_02_Java_Basics;
// block scoping and variable shadowing

public class Lab027_Block_Scoping_variable_Shadowing {
//
//    int i;
//    static int s;
//

    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;   //this variable b can be used only within this block {}- called as block scoping
            System.out.println(b);
        }
        int b = 90; // this variable b with same name is declared inside block and outside block - called as variable shadowing(scope for both variables are different(inside and outside block)
        System.out.println(b);

    }
}
