package day14_abstraction_ploymorphism.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+ " has the auto park function");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+getModel() + " has ability to self drive");

    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " has the start button");

    }

    @Override
    public void drive() {
        System.out.println("I am driving the " + getMake()+getModel()+ " to Costco");

    }

    @Override
    public void fly() {
        System.out.println("I am flying the " + getMake()+getModel()+ " to NYC");

    }
}

/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces
 */
