package ex_13_Functions;
// This is main method overloading, with many main methods, with different data types as parameters/arguments, but only first method is accepted, all others are duplicate.
public class Lab133_InterviewQ_Main_Method_Overloading {
    public static void main(String[] args) {
    System.out.println("I am only running");
    }
    public static void main(String args) {
        System.out.println("Yes");
    }
    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }

}
