package day14_abstraction_ploymorphism;


import day14_abstraction_ploymorphism.car_task.Audi;
import day14_abstraction_ploymorphism.car_task.Car;
import day14_abstraction_ploymorphism.car_task.Honda;
import day14_abstraction_ploymorphism.car_task.Tesla;

public class CarShop {

    public static void main(String[] args) {



    }
}

/*CarShop Class Task:
        1. Create a Class Named 'CarShop':
        - Given an array of Car objects:
Car[] cars = {
        new Honda("Pilot","White", 2010, 25000),
        new Audi("Q6", "Red",2014, 32000),
        new Honda("Accord", "White",2011, 20000  ),
        new Audi("Q4", "Blue", 2015, 33000),
        new Audi("A7", "Black",2019, 35000),
        new Audi("Q8", "White",2018, 40000),
        new Audi("Q5", "Purple",2009, 30000),
        new Audi("A4", "Black", 2011, 30000),
        new Honda("Civic", "Red",2018, 30000),
        new Honda("CR-V", "Red", 2012, 23000),
        new Honda("HR-V", "Blue",2019, 35000),
        new Tesla("Model 3", "White", 2015, 45000),
        new Tesla("Model Y", "Black", 2017, 65000),
        new Tesla("Model X", "White", 2016, 48000),
        new Tesla("Model X", "Blue",2014, 48000),
};

    - Tasks:
        1.2. Display all cars eligible for recall:
        - Honda: Years 2010 to 2011
        - Audi: Years 2015 to 2019
        - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.

*/
