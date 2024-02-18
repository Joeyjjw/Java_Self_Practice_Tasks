package day14_abstraction_ploymorphism.car_task;

public class Toyota extends Car {

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + getMake() + getModel());

    }

    @Override
    public void drive() {
        System.out.println("I am driving the " + getMake() + getModel() + " to Walmart");

    }
}

/*
Create a Subclass of Car Named 'Toyota'.
 */