package ex_07_Increment_Decrement_Op;

public class Lab071_ID_Post_Increment_Op {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);// 10+1 -->11
        System.out.println(a); //11


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);// print 10 and increment a_post to 10+1-->11
        System.out.println(a_post);// 11


    }
}
