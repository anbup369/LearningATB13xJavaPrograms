package ex_09_Switch;
//The selector expression in a switch must be of a type supported by the switch—such as byte, short, int, char, String, enum types, or certain wrapper classes
public class Lab089_Interview_Valid_char_selector {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
                break;

        }
    }
}
