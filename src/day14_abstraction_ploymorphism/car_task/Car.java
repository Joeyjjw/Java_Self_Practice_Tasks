package day14_abstraction_ploymorphism.car_task;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        if(make == null || make.isEmpty()){

            throw new RuntimeException("The make must not be null or empty.");

        }

        this.model = model;
        if(model == null || model.isEmpty()){
            throw new RuntimeException("The model must not be null or empty.");

        }
        this.year = year;
        if(year <= 1886) {
            throw new RuntimeException("The car's age must not be less than 1886");

        }
        setPrice(price);
        setColor(color);


    }



    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price <= 0){
            System.out.println("The car price must not be negative or zero");
        }

        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            throw new RuntimeException("The color must not be null or empty.");
        }
        this.color = color;
    }
    public abstract void start();
    public void stop(){

        System.out.println(make + model + " is stopped");
    }
    public abstract void drive();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */