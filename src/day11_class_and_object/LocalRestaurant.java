package day11_class_and_object;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Sam Polito", "1919 Brown St", 4 );

        Server server1 = new Server("Josh Elli", 1601, 10.0, true);
        Server server2 = new Server("Vincent Smith", 1701, 10.5, false);

        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Adam Smith", 1901, 30.5, true);
        Chef chef2 = new Chef("Jason Lin", 1801, 31.0, false);

        Chef[] chefs = {chef1, chef2};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));
        System.out.println(Arrays.toString(servers));
        System.out.println(restaurant);
        server1.washDishes();
        chef1.makeOrder();





    }
}

/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information

 */
