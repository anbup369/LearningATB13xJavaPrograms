package ex_08_If_Condition;

public class Lab081_If_Else {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);//
        System.out.println(age);//passed 56 from configuration
        if (age > 18){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
