package TASK.POLYMORPHISM;
/*
Method Overriding
 Task 9: Login Functionality
Title: Different login behaviors for users
Description: Create a class User with method login() that prints “User login”. Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages. Demonstrate calling the login() method using base class reference to highlight runtime polymorphism

 */
public class Task9 {
    public static void main(String[] args) {
User obj = new User();
User obj1 = new AdminUser();
User obj2 = new RegularUser();

obj.login();
obj1.login();
obj2.login();
    }
}
class User{

    void login(){
        System.out.println("User login");
    }
}

class AdminUser extends User{
    @Override
    void login(){
        System.out.println("AdminUser login");
    }
}
class RegularUser extends User{
    @Override
    void login(){
        System.out.println("RegularUser login");
    }
}