package ex_21_OOPs_Encapsulation;

public class Lab189_Encapsulation_Demo {

    public static void main(String[] args) {

        //Without Encapsulation
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        //With Encapsulation
        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);
        vwoLogin1.setPassword("pass1234", false);
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);

    }


}

//VWOLogin Without Encapsulation
//- username and password are marked as public, making them directly accessible from outside the class.
//- This exposes sensitive data and allows unintended modifications, like:vwoLogin.password = "345"; // Security risk!
class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }


}

//GoodVWOLogin – Encapsulated Design
//- username and password are declared private, safeguarding them from direct access.
//- Access is provided through getter and setter methods, offering controlled access.
//- The setPassword method has an extra layer of logic:public void setPassword(String password, boolean isAdmin)
//- Only allows updates if isAdmin == true, enforcing authorization control.
class GoodVWOLogin {
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String username;
    private String password;

    // PC
    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Can't change the password!");
        }
    }
}