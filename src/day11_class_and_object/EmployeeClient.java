package day11_class_and_object;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joey Wang", 35,'F', "SDET", 110_000 );
        System.out.println(employee1);

        Employee employee2 = new Employee("Shay Zhang", 38, 'F', "Programmer", 180_000);
        System.out.println(employee2);

    }
}
