package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_String_Builder_Usecases {
    public static void main(String[] args) {

//1. Appending Strings and Other Data Types
        StringBuilder sb_append = new StringBuilder("Hello");
        sb_append.append(" World ");
        sb_append.append(2025);
        System.out.println(sb_append); // Output: Hello World 2025


//2. Inserting at a Specific Index
        StringBuilder sb_insert = new StringBuilder("Java");
        sb_insert.insert(4, " Programming");
        System.out.println(sb_insert); // Output: Java Programming


//3. Replacing a Substring
        StringBuilder sb_replace = new StringBuilder("I like C++");
        sb_replace.replace(7, 11, "Java");
        System.out.println(sb_replace); // Output: I like Java


//4. Deleting Characters
        StringBuilder sb_delete = new StringBuilder("DeleteMe");
        sb_delete.delete(6, 8);
        System.out.println(sb_delete); // Output: Delete


//5. Reversing the String
        StringBuilder sb_reverse = new StringBuilder("Reverse");
        sb_reverse.reverse();
        System.out.println(sb_reverse); // Output: esreveR


//6. Converting to String
        StringBuilder sb_to_string = new StringBuilder("Convert me");
        String result = sb_to_string.toString();
        System.out.println(result); // Output: Convert me


//7. Chaining Methods
        StringBuilder sb_chain = new StringBuilder();
        sb_chain.append("One").append(" Two").append(" Three");
        System.out.println(sb_chain); // Output: One Two Three


//8. Capacity Management
        StringBuilder sb = new StringBuilder(50); // initial capacity
        System.out.println(sb.capacity()); // Output: 50

//9. Reset the buffer
        StringBuilder sb_set = new StringBuilder("Hello");
        sb_set.setLength(2); //length is shorter than existing ,so content is truncated -> Hello(5) to He(2)
        System.out.println(sb_set); // Output: He

        sb_set.setLength(6);//length is longer, so  pads the buffer with null characters (\u0000)
        System.out.println(sb_set); // Output: He\u0000\u0000\u0000\u0000

    }
}






