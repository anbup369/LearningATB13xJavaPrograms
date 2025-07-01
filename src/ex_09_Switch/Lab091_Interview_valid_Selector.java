package ex_09_Switch;
// int is valid selector but long is not valid selector for switch, so Explicit narrowing from long to int
public class Lab091_Interview_valid_Selector {
    public static void main(String[] args) {
        long a11 = 30L;
        switch ((int) a11) { //coverting long to int , since The selector expression in a switch must be of a type supported by the switch—such as byte, short, int, char, String, enum types, or certain wrapper classes
        }
    }
}
