package TASK.ABSTRACT_INTERFACE;
/*
8. Interface Polymorphism

🔶 Objective:

Learn how interfaces support polymorphism – calling the same method on different implementations.

🔶 Steps:

Create an interface Playable with method play().

Create two classes: Guitar and Piano, both implement Playable.

Implement the play() method in both classes with different messages.

In main(), declare a reference of type Playable and assign it objects of Guitar and Piano one by one.

Call play() on each.

🔶 Expected Output:

Playing Guitar

Playing Piano
 */
public class Task8 {
    public static void main(String[] args) {
        Playable obj1 = new Guitar();
        Playable obj2 = new Piano();
        obj1.play();
        obj2.play();
    }
}

interface Playable{
    void play();
}

class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Guitar\n");
    }
}

class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}