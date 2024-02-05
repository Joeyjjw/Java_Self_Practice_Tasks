package day04_selection_statement;

public class FINRA {
    public static void main(String[] args) {
        int number = 15;
        String result = "";

        // if number is equal to 3 & 5 can use switch statement
        //in this case number has to be multiple of 3 & 5
        if (number % 3 == 0 && number % 5 == 0) { // this step has to be 1st, or else bug
            result = "FINRA";
        } else if (number % 5 == 0) {
            result = "RA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else { // otherwise: if the number is not evenly divisible by 3 & 5
            result = "INVALID";
        }

        System.out.println("Output = " + result);


    }
}

/*
Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA"
	instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA


 */