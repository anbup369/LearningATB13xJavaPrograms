package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab197_Abstraction_REAL {

    public static void main(String[] args) {
        // Create Company object with parameters
        Company c1 = new Company("Pramod", "India", 101);

        // Call methods
        System.out.println("Pay: " + c1.computePay());
        c1.mailCheck();
    }

    static class Company extends Employee {

        @Override
        double computePay() {
            return 1000;
        }

        // Parameterized constructor that calls super constructor
        Company(String name, String address, int number) {
            super(name, address, number);
        }
    }

    abstract static class Employee {

        private String name;
        private String address;
        private int number;

        // Default constructor
        Employee() {
            System.out.println("DC");
        }

        // Parameterized constructor
        Employee(String name, String address, int number) {
            System.out.println("Constructing an Employee");
            this.name = name;
            this.address = address;
            this.number = number;
        }

        // Abstract method
        abstract double computePay();

        // Concrete method
        public void mailCheck() {
            System.out.println("Mailing a check to " + this.name + ", " + this.address + ", #" + this.number);
        }
    }
}