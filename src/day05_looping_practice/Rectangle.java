package day05_looping_practice;

public class Rectangle {
    public static void main(String[] args) {


        for (int row = 1; row <= 9 ; row++) {
            for (int column = 1; column < 9 ; column++) {
                System.out.print(" * ");

            }
            System.out.println("");

        }
    }

}

/*
Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */