package day14_abstraction_ploymorphism.car_task;

public class BMW extends Car {

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ getModel() + " has the start button");

    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake()+getModel() + " to the mall");

    }
}

/*
7. Create a Subclass of Car Named 'BMW'.
 */
