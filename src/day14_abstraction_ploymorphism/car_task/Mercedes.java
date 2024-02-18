package day14_abstraction_ploymorphism.car_task;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+ " can auto park by itself");

    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + getMake()+getModel());

    }

    @Override
    public void drive() {
        System.out.println("Driving the " + getMake() + getModel() + " to go to the movie");

    }
}

/*
8. Create two Subclasses of Car ('Mercedes') that Implement the AutoPark Interface.
 */
