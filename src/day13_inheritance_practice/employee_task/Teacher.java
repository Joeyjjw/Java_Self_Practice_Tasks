package day13_inheritance_practice.employee_task;

public class Teacher extends Employee{
    public Teacher(String name, String gender, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, gender, age, employeeId, jobTitle, companyName, salary);

    }
    public void work(){
        System.out.println( getName() + " is teaching");
    }
}
