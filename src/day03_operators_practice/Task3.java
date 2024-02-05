package day03_operators_practice;

public class Task3 {
    public static void main(String[] args) {

        int num = -895;

        if(num > 0) {
            System.out.println("Number is positive");
            if (num % 2 == 0) {
                System.out.println("Number is even");
            }else {
                System.out.println("Number is odd");
            }
        }else if (num < 0) {
            System.out.println("Number is negative");
            if (num % 2 == 0) {
                System.out.println("Number is even");
            }else {
                System.out.println("Number is odd");
            }
        }else {
            System.out.println("Number is zero");
        }
    }
}
