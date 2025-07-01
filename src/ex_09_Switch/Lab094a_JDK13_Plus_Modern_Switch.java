package ex_09_Switch;
// using Yield
//Used to return a value from a case block when using code blocks {} instead of ->.

public class Lab094a_JDK13_Plus_Modern_Switch {
    public static void main(String[] args) {
        int itemcode = 006;

        String result = switch (itemcode) {
            case 001, 002, 005 -> {
                System.out.println("All of them are Electronic Gadgets");
                yield "Electronic";
            }
            case 004, 006, 007 -> {
                System.out.println("This is Mech Gadget");
                yield "Mechanical";
            }
            default -> {
                System.out.println("None");
                yield "Unknown";
            }
        };

        System.out.println("Category: " + result);
    }
}
