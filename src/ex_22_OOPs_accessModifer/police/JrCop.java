package ex_22_OOPs_accessModifer.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(5);
        jrCop.canIShoot();
        jrCop.thisDefaultF1();
//        int gun = jrCop.gun;
        System.out.println(jrCop.gun);
    }
}
