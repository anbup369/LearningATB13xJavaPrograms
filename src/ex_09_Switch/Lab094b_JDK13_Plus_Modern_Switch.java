package ex_09_Switch;
// using Yield
//Used to return a value from a case block when using code blocks {} instead of ->.

public class Lab094b_JDK13_Plus_Modern_Switch {
    public static void main(String[] args) {
        int itemcode = 006;

        String result = switch (itemcode) {
            case 001, 002, 005 -> "Electronic";

            case 004, 006, 007 -> "Mechanical";

            default -> "Unknown";

        };

        System.out.println("Category: " + result);
    }
}



