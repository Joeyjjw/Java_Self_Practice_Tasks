package day14_abstraction_ploymorphism.car_task;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ getModel() + " has auto park");

    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " has start button");

    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake()+getModel() + " to shopping");


    }
}

/*
8. Create two Subclasses of Car ('Audi') that Implement the AutoPark Interface.
 */
