package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {

    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
        // Engine e1 = new Engine(); Cannot instantiate abstract class
    }

}

abstract class GearManagement {
    abstract void gearSet();
}

abstract class Engine extends GearManagement {
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Everything is Good!");
    }
}

class WagonR extends Engine {

    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car!");
    }

    @Override
    void gearSet() {
        System.out.println("Gear set successfully.");
    }

    void drive() {
        checkEngine();
        gearSet();
        startEngine();
        stopEngine();
    }


}
