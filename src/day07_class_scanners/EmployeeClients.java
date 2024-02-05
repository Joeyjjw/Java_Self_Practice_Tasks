package day07_class_scanners;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setInfo("Joey", 35, 'F', "SDET", 105_000, true, false );;

        employee2.setInfo("Shay", 39, 'F', "BA", 120_000, true, false);

        System.out.println("Name: " + employee1.name + "\nAge: " + employee1.age +
                "\nGender: " + employee1.gender + "\nJobTitle: " + employee1.jobTitle
        + "\nSalary: " + employee1.salary);

    }

}
