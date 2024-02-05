package day04_selection_statement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20, b = 25, c = 30;
        // has to be three different numbers
        //median -> the number in between middle of two other numbers(one small, one bigger)

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b );
        /*
        a is median
         1. if c is max & b is the minimum
         2. if b is max & c is the minimum
         */

        boolean bIsMedian = (a > b && b < c) || (c > b && b > a);
        /*
        c is max, a is min, then b is median
        a is max, c is min, then b is median
         */

        //boolean cIsMedian = (a > c && c > b) || (b > c && c > a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;



        if (aIsMedian) { //if a is the median in three different numbers
            System.out.println(a + " is the median number");
        } else if (bIsMedian) { // if b is the median number in three different numbers
            System.out.println(b + " is the median number");
        } else { //otherwise: c
            System.out.println(c + " is the median number");
        }
    }
}


/*
 Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three
integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */