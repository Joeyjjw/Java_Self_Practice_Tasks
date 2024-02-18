package day07_class_scanners;

public class Employee {

    public String name;
    public int age; // instance can store many different values
    public char gender;
    public String jobTitle;
    public double salary; // if make it with static, only 1 cope with same value can be stored

    public boolean ifFullTime;
    public boolean isMarried;

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, boolean ifFullTime, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.ifFullTime = ifFullTime;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ifFullTime=" + ifFullTime +
                ", isMarried=" + isMarried +
                '}';
    }

    // right click, Generate-> constructor-> select all options command 'A'.
    //below add void setInfo
    public void setInfo(String name, int age, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println( name + " is working");
    }

}


/*
Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */
