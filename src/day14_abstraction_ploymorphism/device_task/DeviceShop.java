package day14_abstraction_ploymorphism.device_task;

public class DeviceShop {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone", "15", "6.1", 1100, "Red", true, true);
        iphone.downloadApp();
        iphone.turnOn();
        System.out.println(iphone);

        Samsung samsung = new Samsung("Samsung", "galaxy", "7.1", 1200, "Black", true, true);
        samsung.downloadApp();
        samsung.turnOff();
        System.out.println(samsung);

        Google google = new Google("Google", "google voice", "6.2", 1300, "Sliver", true, true);
        google.downloadApp();
        System.out.println(google);

        PersonalComputer personalComputer = new PersonalComputer("Apple", "Mac Air", "12.1", 1200, "Sliver", true, true);
        System.out.println(personalComputer);
    }
}

/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */
