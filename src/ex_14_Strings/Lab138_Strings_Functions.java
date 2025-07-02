package ex_14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("Character c is: "+c);

        String s1 = "ABCD";
        System.out.println("given string is: "+s1);
        System.out.println("Lenght of s1 is: "+s1.length());
        System.out.println("char at index 2 is: "+s1.charAt(2));
        System.out.println("compare string s1 to 'abcd'  case sensitive: "+s1.equals("abcd"));
        System.out.println("compare string s1 to 'abcd' No case sensitive: "+s1.equalsIgnoreCase("abcd"));
        System.out.println("Extract sub string 'BCD' from s1 : "+s1.substring(1,4));
        System.out.println("s1 to Uppercase: "+s1.toUpperCase());
        System.out.println("s1 to Lowercase: "+s1.toLowerCase());
        System.out.println("Add string 'E' to end of string s1: "+s1.concat("E"));

        String s2 = " ABCD ";

        System.out.println("Remove leading and trailing spaces of string s2: "+s2.trim());

//        s.length();         // Returns number of characters
//        s.charAt(0);        // Gets character at index
//        s.equals("test");   // Compares value
//        s.equalsIgnoreCase("Test"); // Case-insensitive compare
//        s.substring(1, 3);  // Extracts substring
//        s.toUpperCase();    // Converts to uppercase
//        s.trim();           // Removes leading/trailing spaces
    }
}
