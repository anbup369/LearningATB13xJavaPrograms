package ex_09_Switch;

/*  What's New in the Modern switch from Jdk 13+ (i.e from Jdk 14).
| Feature | Description |
| Switch Expressions | You can now use switch as an expression that returns a value, not just a statement. |
| Arrow Syntax (->) | Replaces case blocks with cleaner, more concise syntax. |
| Multiple Labels | You can combine multiple case values in a single line. |
| Exhaustiveness (with default) | The compiler checks if all cases are covered, making the code more robust. |
| yield Keyword | Used to return a value from a case block when using code blocks {} instead of ->. |

     Why Modern Switch.
- More concise and readable
- Reduces errors (e.g., forgotten break statements)--> no break statement needed
- Powerful as an expression — return values directly!

 */
public class Lab093_JDK13_Plus_Modern_Switch {
    public static void main(String[] args) {
        // in JDK > 13(i.e from jdk 14)
        //  No need of break keyword
        // one line supported.
        int itemCode = 002;
        switch (itemCode) {
            case 001 -> System.out.println("001");//one line support
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default"); // no break needed

        }
    }
}
