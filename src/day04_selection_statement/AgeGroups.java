package day04_selection_statement;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 42;

        boolean valid = age >= 0 && age <= 150;

        String result = "";

        if (valid){
            if (age <= 20) {
                System.out.println("Young - Teenager");
            }else if (age <= 55) {
                System.out.println("Young Middle - Aged Adult");
            }else {
                System.out.println("senior");
            }
        }else {
            result = "invalid";
        }
        System.out.println(result);

    }
}

/*

An integer variable named age is given.
	Write a program that can determine the age group of a person.
	The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */