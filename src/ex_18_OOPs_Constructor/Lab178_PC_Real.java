package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT",97654321,"abc");
        System.out.println(p1.name);
        Person p2 = new Person("PRAMOD",98989898,"XYZ");
        System.out.println(p2.name);
//        Person p3  = new Person();
//        p3.name  = "Smita";
//        System.out.println(p3.name);
        Person p4 = new Person("nameonly",999999999);
        System.out.println(p4.name);
        new Person();
        new Person("nameeeee");






    }
}


class Person {

    String name;
    long phone;
    String address;

    Person(){
        System.out.println("no parameter ");
    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;

    }
    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;

    }




}