package day05_looping_practice;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0; //while loop-> unknown number of loop

        while(num >= 0){  //0 >=0 -> true
            // greater equal 0, it will repeat it non-stop until it's false with negative number
            System.out.println("Enter a number");
            num = input.nextInt();

            System.out.println("------------------");

            String answer = ""; // answer only yes or no

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Enter yes or no");
                answer = input.next().toLowerCase(); // for user to enter answer

                System.out.println("-------------------------");


             }
            String toContinue = "yes";

            while(true){// with 'true' keyword need to use break;  at the end
                System.out.println("Hello world");
                System.out.println("Would you like to continue");
                toContinue = input.next();

                while(!(toContinue.equalsIgnoreCase("yes") || toContinue.equalsIgnoreCase("no"))){
                    System.out.println("Please re-enter! Would you like to continue?");
                    toContinue=input.next(); //if enter maybe, this loop will be executed
                    //Nested loop
                }

                if(toContinue.equalsIgnoreCase("no")){
                    break;
                }

            }
            input.close();
        }

    }
}
