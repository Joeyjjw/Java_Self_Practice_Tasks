package day14_abstraction_ploymorphism.device_task;

public abstract class Device {
    private final String brand, model;
    private final String size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        if(brand == null || brand.isEmpty()){
            throw new RuntimeException("The brand must not be null or empty");
        }

        this.model = model;

        if(model == null || model.isEmpty()){
            throw new RuntimeException("The model must not be null or empty");
        }
        this.size = size;
        if(size == null || size.isEmpty()){
            throw new RuntimeException("The size must not be null or empty");
        }
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("The price must not be zero or negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            throw new RuntimeException("The color must not be null or empty");
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}


/*
1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */
