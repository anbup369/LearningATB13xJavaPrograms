package ex_03_Literals;


public class Task1_tables_printing {
    public static void main(String[] args) {
        int num = 5; //This code is printing parts of the multiplication table for 5 without using any loop logic using format specifiers
        System.out.printf("%d x %d = %d",num,1,num).println();
        System.out.printf("%d x %d = %d",num,2,num*2).println();
        System.out.printf("%d x %d = %d",num,3,num*3).println();
        System.out.printf("%d x %d = %d",num,4,num*4).println();
        System.out.println("...");
        System.out.printf("%d x %d = %d",num,10,num*10).println();
    }
}
