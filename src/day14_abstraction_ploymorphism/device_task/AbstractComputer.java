package day14_abstraction_ploymorphism.device_task;

public abstract class AbstractComputer extends Device{
    public AbstractComputer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + getModel() + " is turn on");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + getModel() + " is turn off");

    }
}

/*
8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */
