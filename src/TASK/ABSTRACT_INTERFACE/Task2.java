package TASK.ABSTRACT_INTERFACE;
/*
2. Bank Interest Calculation

Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.

🔶 Expected Output:

SBI Interest Rate: 6.5%

HDFC Interest Rate: 7.0%
 */
public class Task2 {
    public static void main(String[] args) {
        Bank obj1 = new SBI();
        Bank obj2 = new HDFC();

        System.out.println(obj1.bankName+" Interest Rate: " + obj1.getInterestRate() + "%");
        System.out.println(obj2.bankName+" Interest Rate: " + obj2.getInterestRate() + "%");
    }
}

abstract class Bank{
    String bankName;
     Bank(String name){
        this.bankName = name;
    }

    abstract Double getInterestRate();

}

class SBI extends Bank{
    SBI(){
        super("SBI");
    }
    Double getInterestRate(){
        return 6.5;
    }
}

class HDFC extends Bank{
    HDFC(){
        super("HDFC");
    }
    Double getInterestRate(){
        return 7.0;
    }
}