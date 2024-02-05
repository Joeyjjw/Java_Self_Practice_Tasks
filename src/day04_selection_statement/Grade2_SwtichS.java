package day04_selection_statement;

public class Grade2_SwtichS {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("Excellent"); //String result can be used to replace sout
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}

/*
A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
 */