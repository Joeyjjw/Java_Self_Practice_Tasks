package day14_abstraction_ploymorphism.car_task;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+ " can auto park by itself");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+getModel() + " can self drive by itself");

    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel() + " has a push start button");

    }

    @Override
    public void drive() {
        System.out.println("Driving the " + getMake()+getModel() + " to the restaurant");

    }
}

/*

9. Create two Subclasses of Car ('Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */
