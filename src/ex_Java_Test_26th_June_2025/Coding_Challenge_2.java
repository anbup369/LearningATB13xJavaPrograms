package ex_Java_Test_26th_June_2025;

public class Coding_Challenge_2 {
    public static void main(String[] args) {
//        String Comparison and Equality
//
//        Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
//                Examples:
//        Input:
//        String1: "Hello", String2: "hello", String3: "Hello"
//        Output:
//        equals(): false, equalsIgnoreCase(): true, compareTo(): -32
//💡 Explanation:Program compares strings using various methods

        //String declaration
        String String1 = "Hello";
        String String2 = "hello";
        String String3 = "Hello";


        // Using equals()
        System.out.println("equals():"+(String1.equals(String2))); // Result: false, since equals() check exact character matches(case sensitivity)

        System.out.println("equals():"+(String1.equals(String3))); // Result: true, since both characters matched.
        // Using equalsIgnoreCase()
        System.out.println("equalsIgnoreCase():"+(String1.equalsIgnoreCase(String2))); //Result: true, since equalsIgnoreCase() check  character matches and ignore case sensitivity
        System.out.println("equalsIgnoreCase():"+(String1.equalsIgnoreCase(String3))); // Result: true, since both characters matched, any way there is not case sensitivity.
        // Using compareTo()
        System.out.println("compareTo():"+(String1.compareTo(String2)));//Result: -32, since Java uses Unicode values to compare characters. The difference between 'H' (72) and 'h' (104) is -32.


        System.out.println("compareTo():"+(String1.compareTo(String3))); //Result: 0 , since both characters are identical
        //Using == (reference comparison)
        System.out.println("String1==String2:"+(String1==String2)); //Result: false, since both are different characters, its reference are different(different objects)
        System.out.println("String1==String3:"+(String1==String3));//Result: true.  since it is identical characters,its reference are same(same object)

    }
}
