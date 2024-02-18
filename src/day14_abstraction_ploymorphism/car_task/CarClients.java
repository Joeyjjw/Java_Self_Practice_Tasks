package day14_abstraction_ploymorphism.car_task;

public class CarClients {
    public static void main(String[] args) {

        Audi audi = new Audi("Audi", "Q5", 2024, 56_000, "White");
        System.out.println(audi);
        audi.autoPark();
        audi.start();
        audi.drive();
        System.out.println("-------------------------------------");

        Toyota toyota = new Toyota(null, "RAV4", 2022, 35_000, "Blue");
        System.out.println(toyota);
        toyota.drive();
        toyota.stop();
        System.out.println("-------------------------------------");

        Mercedes mercedes = new Mercedes("Mercedes", "Benz", 2020, 55_000, "black");
        System.out.println(mercedes);
        mercedes.autoPark();
        mercedes.stop();
        mercedes.drive();
        System.out.println("-------------------------------------");

        Honda honda = new Honda("Honda", "CRV", 2019, 25_000, "Brown");
        System.out.println(honda);
        honda.start();
        honda.drive();
        System.out.println("--------------------------------------------");

        BMW bmw = new BMW("BMW", "X5", 2016, 29_000, "Sliver");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        System.out.println("------------------------------------------");

        Tesla tesla = new Tesla("Tesla", "Model Y", 2024, 46_000, "Red");
        tesla.autoPark();
        tesla.selfDrive();
        tesla.start();
        System.out.println(tesla);
        System.out.println("--------------------------------------------");


        Nio nio = new Nio("NIO", "ES6", 2024, 45_000, "Black");
        System.out.println(nio);
        nio.selfDrive();
        nio.autoPark();
        nio.drive();
        nio.stop();
        System.out.println("------------------------------------------");

        CydeoCar cydeoCar = new CydeoCar("CydeoCar", "CarX9", 2024, 60_000, "Blue");
        System.out.println(cydeoCar);
        cydeoCar.fly();
        cydeoCar.selfDrive();
        cydeoCar.autoPark();
        cydeoCar.start();
        cydeoCar.stop();
        cydeoCar.drive();


    }
}

/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */