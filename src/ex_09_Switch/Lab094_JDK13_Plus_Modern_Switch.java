package ex_09_Switch;
//Modern switch with multiple cases in same line.
public class Lab094_JDK13_Plus_Modern_Switch {
    public static void main(String[] args) {
        int itemcode = 006;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
