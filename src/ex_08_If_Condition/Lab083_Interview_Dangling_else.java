package ex_08_If_Condition;
//dangling else -->Java  always associates the else with the nearest unmatched if
public class Lab083_Interview_Dangling_else {
    public static void main(String[] args) {
        int a = 5;
        if (a == 5)
            if (a < 10)
                System.out.println("Less than 10");
            else
                System.out.println("Greater than 10");
    }
}