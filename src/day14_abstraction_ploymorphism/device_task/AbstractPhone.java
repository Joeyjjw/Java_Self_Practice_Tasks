package day14_abstraction_ploymorphism.device_task;

public abstract class AbstractPhone extends Device{
    public AbstractPhone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
    public void call(long phoneNum){
        System.out.println("Making a call to " + phoneNum);

    }
    public void text(long phoneNum){
        System.out.println("Texting a message to " + phoneNum );

    }
}

/*
7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

 */