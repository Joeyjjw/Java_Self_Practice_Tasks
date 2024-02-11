package day13_inheritance_practice.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone15", "6.1 inches", 999.99, "Red");
        Nokia nokia = new Nokia("Nokia", "Nokia11", "5.1 inches", 599.99, "Sliver");
        Samsung samsung = new Samsung("Samsung", "Galaxy", "7.1 inches", 899.99, "Black");

        iphone.faceTime("1234567890");
        nokia.text("1234567890");
        samsung.call("1234567890");
        System.out.println(iphone);
        System.out.println(nokia);
        System.out.println(samsung);
    }
}
/*
Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */