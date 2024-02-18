package day14_abstraction_ploymorphism.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public Tesla(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + getModel() + " can park by itself");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + getModel() + " can drive by itself while you sleep");

    }

    @Override
    public void start() {
        System.out.println(getMake() + getModel() + " has a start button");

    }

    @Override
    public void drive() {
        System.out.println("I am driving the " + getMake() + getModel() + " to get it charged");

    }
}

/*

9. Create two Subclasses of Car ('Tesla') that Implement both AutoPark and AutoPilot Interfaces.
 */
