package day13_inheritance_practice.employee_task;

public class Tester extends Employee {

    public Tester(String name, String gender, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, gender, age, employeeId, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()  + getName() + " is testing");
    }
}

/*
Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.
 */
