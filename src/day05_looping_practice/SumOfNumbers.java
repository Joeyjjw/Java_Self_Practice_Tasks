package day05_looping_practice;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= 100; i++) {
            num1 += i;

        }
        for (int i = 0; i <=50 ; i++) {
            num2 += i;

        }
        System.out.println(num1);
        System.out.println(num2);

    }
}

/*
Create a class named SumOfNumbers and write a program to calculate
the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275
 */
