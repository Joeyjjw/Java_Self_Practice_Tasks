package day07_class_scanners;

public class AddressClients {
    public static void main(String[] args) {
        Address address = new Address();
        address. buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "VA";
        address.zipCode= "22012";
        System.out.println(address.toString());
    }
}

/*
 Actions:
            toString(): returns the string representation of the address object in the following format:

                  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012


      Create another class named AddressClients, create multiple address objects, and test each function of the address object.
 */
