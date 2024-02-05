package day02_variable_practice;

public class ShippingAddress {
    public static void main(String[] args) {

        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;

        //final keyword cannot be changes such as DOB. SSN.
        final String DATE_OF_BIRTH = "June/09/1980"; //ALL UPPERCASE

        System.out.println("Your Shipping address is:\n\t\t");
        System.out.println("\t\t\t"+fullName);
        System.out.println("\t\t\t"+buildingNumber + " " + streetName);
        System.out.println("\t\t\t"+city+"," + state + " " + zipCode);





    }
}


/*
    Use concatenation to print the full shipping address
        Example:
				fullName = "Aaron Kissinger";
				buildingNumber = 13621;
				streetName = "Legacy Circle"
				city = "Fairfax;
				state = "VA";
				zipCode = 22030;

			Output:
	      		Your Shipping address is:
                			Aaron Kissinger
                			13621 Legacy Circle
                			Fairfax, VA 22030


 */