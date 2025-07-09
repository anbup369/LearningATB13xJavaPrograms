package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {

        //for user amit getName
        ICICIBank amit = new ICICIBank("Amit", 100);
//        long bal_a = amit.getBal();
        System.out.println("Initial balance for user " + amit.getName() + " is: " + amit.getBal());
        amit.setBal(500, true);
//        long bal_a2 = amit.getBal();
        System.out.println("Current Balance of user " + amit.getName() + " is: " + amit.getBal());

        //for user lucky getName
        ICICIBank lucky = new ICICIBank("Lucky", 900);
//        long bal_l = lucky.getBal();
        System.out.println("Initial balance for user " + lucky.getName() + " is: " + lucky.getBal());
        lucky.setBal(1000, true);
//        long bal_l2 = lucky.getBal();
        System.out.println("Current Balance of user " + lucky.getName() + " is: " + lucky.getBal());


    }
}


class ICICIBank {

    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public long getBal() {

        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}