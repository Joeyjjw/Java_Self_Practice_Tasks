package day11_class_and_object;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost() {
        if (size.equalsIgnoreCase("small")) {
            int totalCost = 10 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("medium")) {
            int totalCost = 12 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("large")) {
            int totalCost = 14 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        return 0;


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost= " + calcCost();
    }
}

/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */
