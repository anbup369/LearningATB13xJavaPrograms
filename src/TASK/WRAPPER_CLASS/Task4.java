package TASK.WRAPPER_CLASS;

/*
Task 4: Convert Integer to int using Unboxing

Description:
Create an Integer object and convert it back to primitive using unboxing.

Expected Output:

Integer object: 20

Unboxed primitive: 20
 */
public class Task4 {
    public static void main(String[] args) {

        Integer boxedNum = 20;
        int num = boxedNum;

        System.out.println("Wrapper object: " + boxedNum);
        System.out.println("Primitive value: " + num);

    }
}
