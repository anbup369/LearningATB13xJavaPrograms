package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        // how many "Hello" string in String Constant pool, answer: one

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        // how many "Hello" string in Object Area, answer: Three

        // SCP | OA
        // 1 | 3 -> 4

    }
}
