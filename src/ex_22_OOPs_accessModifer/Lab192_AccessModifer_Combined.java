package ex_22_OOPs_accessModifer;

public class Lab192_AccessModifer_Combined {

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.getGold());
        father.setGold(20);
        System.out.println(father.getGold());

        Son son = new Son();
        son.weCanUse();

    }
}

class Father {
    private int gold = 10;       // Only accessible inside Father
    int car = 1;                 // Package-private (default)
    public int bhk3 = 1;         // Public access
    protected String watch = "Titan"; // Protected access

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}

class Son extends Father {
    void weCanUse() {
//         System.out.println(gold);        // private, not accessible
        System.out.println(car);           // default, accessible (same package)
        System.out.println(bhk3);          // public, accessible anywhere
        System.out.println(watch);         // protected, accessible via inheritance
    }
}