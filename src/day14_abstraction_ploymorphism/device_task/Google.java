package day14_abstraction_ploymorphism.device_task;

public class Google extends AbstractPhone implements Downloadable, AndroidApps{
    public Google(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
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

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + getModel() + " is downloading app from " + OS + AppStoreName );

    }
}
