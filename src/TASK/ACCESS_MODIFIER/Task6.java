package TASK.ACCESS_MODIFIER;
/*
Program 6: Demonstrate protected Access Modifier
:-  Learn how protected members behave in inheritance.
📝 Instructions:
Create a class Animal with a protected method eat() that prints "Animal is eating".
Create a child class Dog that extends Animal.
Create a method doEat() in Dog class which calls eat() using inheritance.
In main(), create a Dog object and call doEat().
 */
public class Task6 {
    public static void main(String[] args) {
Dog obj = new Dog();
obj.doEat();
    }
}

class Animal {
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void doEat(){
        eat();
    }
}