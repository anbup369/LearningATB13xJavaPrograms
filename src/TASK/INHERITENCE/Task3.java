package TASK.INHERITENCE;
/*
 Task 3: "Multilevel Login System"

 Description: (Multilevel Inheritance)

Create a class User with a method login().
Extend it with a class AdminUser that adds a method accessAdminPanel().
Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

Use an object of SuperAdmin to call all three methods
 */
public class Task3 {
    public static void main(String[] args) {
        SuperAdmin obj = new SuperAdmin();
        obj.login();
        obj.accessAdminPanel();
        obj.shutdownSystem();
    }
}

class User{
 void login(){
     System.out.println("login method from class User");
 }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("accessAdminPanel method from AdminUser");

    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("shutdownSystem method from SuperAdmin");
    }
}