package ex_19_OOps_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);//output 1000
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);//output 5000
        s1.bhk2();
        s1.bhk3();

        Father s3 = new Son();
        System.out.println(s3.gold_f);//output 1000
    }


}

class Father {
    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("2BHK Father");
    }  //  Behaviour |  Method | Function | Data members

}

class Son extends Father {


    int gold_f = 5000; // Attribute | Data variables |  Property | Instance Variables


    void bhk3() {
        System.out.println("3BHK Son");
    }

}