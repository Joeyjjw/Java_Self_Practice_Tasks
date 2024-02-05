package day02_variable_practice;

public class EmployeeInfo {
    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name:" + employeeName);
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + age);
        System.out.println("Employee ID:" + employeeId);
        System.out.println("Job title:" + jobTitle);
        System.out.println("Company name:" + companyName);
        System.out.println("Full time:" + isFullTime);
        System.out.println("Years of work experience:" + yearsOfExperience + "years");
        System.out.println("Salary:" + salary);
        System.out.println("Married:" + isMarried);



    }

}

/*  Declare the following variables:
			employeeName (String)
			age (int)
			gender (char)
			companyName (String)
			jobTitle (String)
			yearsOfExperience (double)
			salary (int)
			isFullTime (boolean)
			isMarried (boolean)
			employeeId (String)

			Output:
				Employee name: Shay
				Gender: F
				Age: 24
				Employee ID: B101
				Job title: SDET
				Company name: Apple Inc
				Full time: true
				Years of work experience: 2.5 years
				Salary: $120000.0
				Married: false

 */
