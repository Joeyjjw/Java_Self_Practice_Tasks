package day13_inheritance_practice.employee_task;

public class EmployeeClient {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Josh", "M", 35, "A09","SDET", "Google", 120_000);

        Developer developer1 = new Developer("Eric", "M", 36, "A05", "Programmer", "Zoom", 160_000, "Java");

        Teacher teacher1 = new Teacher("Jill", "F", 38, "A03", "Teacher", "School", 110_000);

        Driver driver1 = new Driver("Sam", "M", 38, "A06", "Driver", "Wholefood", 55_000);

        tester1.work();
        developer1.work();
        teacher1.work();
        driver1.work();

    }
}
/*
Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */