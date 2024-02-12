package day13_inheritance_practice.employee_task;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String gender, int age, String employeeId, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, gender, age, employeeId, jobTitle, companyName, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        if(programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()){
            throw new RuntimeException("Programming language cannot be Empty or Blank");
        }
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle() + getName() + " is coding in " + programmingLanguage);
    }
}

/*
 2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */
