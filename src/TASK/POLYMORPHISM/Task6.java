package TASK.POLYMORPHISM;
/*
Method Overriding
 Task 6: Animal Sounds
Title: Override sound behavior in subclasses
Description: Create a base class Animal with a method sound(). Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively. Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.

 */
public class Task6 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        System.out.println(a1.sound()); // Bark
        System.out.println(a2.sound()); // Meow
        System.out.println(a3.sound()); // Moo

    }
}
class Animal{
    String sound(){
        return "sound";

    }
}
class Dog extends Animal{
    @Override
    String sound(){
return "Bark";
    }
}

class Cat extends Animal{
    @Override
    String sound(){
        return "Meow";
    }
}
class Cow extends Animal{
    @Override
    String sound(){
        return "Moo";
    }
}