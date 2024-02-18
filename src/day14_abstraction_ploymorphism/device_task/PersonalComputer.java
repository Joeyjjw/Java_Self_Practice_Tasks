package day14_abstraction_ploymorphism.device_task;

public class PersonalComputer extends AbstractComputer{
    public PersonalComputer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

}
