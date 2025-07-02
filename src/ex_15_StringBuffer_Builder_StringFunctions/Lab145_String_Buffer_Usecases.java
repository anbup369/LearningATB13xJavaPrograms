package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_String_Buffer_Usecases {
    public static void main(String[] args) {


//        1. Appending Text
//        Used to efficiently combine strings without repeated memory allocation.
        StringBuffer sb_append = new StringBuffer("Java");
        sb_append.append(" World!");
        System.out.println(sb_append); // Output: Java World!

//        2. Inserting Text
//        Allows insertion at a specific index.
        StringBuffer sb_insert = new StringBuffer("Java World");
        sb_insert.insert(5, "Programming ");
        System.out.println(sb_insert); // Output: Java Programming World

//        3. Replacing Text
//        Replace a range of characters.
        StringBuffer sb_replace = new StringBuffer("Good Night");
        sb_replace.replace(5, 10, "Morning");
        System.out.println(sb_replace); // Output: Good Morning

//4. Deleting Characters
//Remove text between indexes.
        StringBuffer sb_delete = new StringBuffer("Delete This");
        sb_delete.delete(7, 11);
        System.out.println(sb_delete); // Output: Delete



//5. Reversing the Content
//Reverse the character sequence easily.
        StringBuffer sb_reverse = new StringBuffer("desserts");
        sb_reverse.reverse();
        System.out.println(sb_reverse); // Output: stressed



//6. Capacity Management --> newCapacity = (currentCapacity * 2) + 2
//Helps when you know the size of data beforehand.
        StringBuffer sb_capacity = new StringBuffer("Hello"); // Initial capacity - default capacity is 16 +5(hello) - 21
        sb_capacity.append(" World"); // 'Hello World' --> 11
        sb_capacity.append("1234567890 "); //'1234567890 '-->11, 'Hello World'+'1234567890 '-->22 , so capacity expand to (21*2)+2 --> 44
        System.out.println(sb_capacity.capacity()); // Output: 44
//6.a Ensure Capacity
        //
//        StringBuffer sb_ensure = new StringBuffer();// Default is 16
//        System.out.println("Before: " + sb.capacity()); // Default is 16
//        sb_ensure.append("Hello");
//        sb_ensure.capacity();

        StringBuffer sb_ensure = new StringBuffer();
        System.out.println("Before: " + sb_ensure.capacity()); // Default is 16
        sb_ensure.ensureCapacity(40);
        System.out.println("After: " + sb_ensure.capacity());  // Likely 34 or 40 depending on logic

//7. Thread-Safe Operations
//Multiple threads can access and modify the buffer safely.
        //StringBuffer sb_thread_safe = new StringBuffer("Sync");

// In multithreaded setup, StringBuffer prevents race conditions
        //synchronized(sb_thread_safe) {
           // sb_thread_safe.append(" Safe");
        }


    }




















