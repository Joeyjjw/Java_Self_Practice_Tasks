package day14_abstraction_ploymorphism.car_task;

public class Honda extends Car {

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public Honda(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel() + " has a start button to push to start");

    }

    @Override
    public void drive() {
        System.out.println("I am driving the " + getMake() + getModel() + " to picking up food");

    }
}

/*
6. Create a Subclass of Car Named 'Honda'.
 */