package TASK.POLYMORPHISM;

/*
Method Overriding
 Task 8: Employee Role Info
Title: Show employee roles with overridden methods
Description: Create a class Employee with method role() printing “General Employee”. Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles. Call role() on each object to show how overriding helps in specialization.

 */
public class Task8 {
    public static void main(String[] args) {
        Employee role = new Employee();
        role.role();
        Employee role1 = new Manager();
        role1.role();
        Employee role2 = new Clerk();
        role2.role();
        Employee role3 = new Tester();
        role3.role();


    }
}

class Employee {
    void role() {
        System.out.println("General Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("role: Manager");
    }
}

class Clerk extends Employee {
    void role() {
        System.out.println("role: Clerk");
    }
}

class Tester extends Employee {
    void role() {
        System.out.println("role: Tester");
    }
}