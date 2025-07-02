package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBuilder_all {
    public static void main(String[] args) {
        // You can switch between StringBuilder and StringBuffer here
        StringBuilder sb = new StringBuilder("Hello");
        // StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("append(): " + sb);

        sb.insert(5, ",");
        System.out.println("insert(): " + sb);

        sb.delete(5, 6);
        System.out.println("delete(): " + sb);

        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("replace(): " + sb);

        sb.reverse();
        System.out.println("reverse(): " + sb);

        sb.reverse(); // revert back
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + sb);

        System.out.println("charAt(0): " + sb.charAt(0));

        System.out.println("substring(0, 2): " + sb.substring(0, 2));

        System.out.println("length(): " + sb.length());

        System.out.println("capacity(): " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        sb.setLength(5);
        System.out.println("setLength(5): " + sb);

        System.out.println("toString(): " + sb.toString());

        sb.append(" Hello Hello");
        System.out.println("indexOf(\"Hello\"): " + sb.indexOf("Hello"));

        System.out.println("lastIndexOf(\"Hello\"): " + sb.lastIndexOf("Hello"));

        sb.trimToSize(); // Only available in Java 1.5+
        System.out.println("trimToSize() called. Capacity now: " + sb.capacity());
    }
}
