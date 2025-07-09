package ex_22_OOPs_accessModifer.criminal;

import ex_22_OOPs_accessModifer.police.Cop;

public class SubClass extends Cop {


    public static void main(String[] args) {

        SubClass subClass = new SubClass(100);
        subClass.canIShoot();//Accessible: inherited protected method
//        subClass.thisisDefaultF1();Not accessible: default method from another package
        System.out.println(subClass.gun);//Accessible: Inherited public variable

    }

    public SubClass(int bullet) {

        super(bullet);
    }
}
