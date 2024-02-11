package day12_encapsulation_practice;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name ==null ||name.isEmpty() || name.isBlank() ){
            throw new RuntimeException("The name cannot be empty or blank.");

        }
        if(!Character.isLetter(name.charAt(0))) {
            throw new RuntimeException("The name cannot contain any special characters other than space.");

        }
            char[] eachLetter = name.toCharArray();
            for (char each : eachLetter) {
                if (!Character.isLetterOrDigit(each) && !Character.isWhitespace(each)) {
                    throw new RuntimeException("The name must start with letters");

                }

        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice <= 0){
            throw new RuntimeException("The unitPrice cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0) {

            throw new RuntimeException("The quantity cannot be negative.");
        }
        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ",totalCost=" + calcCost()+
                '}';
    }
}

/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */