package day13_inheritance_practice.phone_task;

public class Iphone extends Phone{
    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void faceTime(String phoneNumber) {
        System.out.println("Facetime with the number: " + phoneNumber);
    }
}
