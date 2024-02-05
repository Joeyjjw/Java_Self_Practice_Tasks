package day06_method_practice;

public class OddAndEven {
    public static void main(String[] args) {
        boolean result = isOdd(100);
        boolean result2 = isEven(100);
        System.out.println(result);
        System.out.println(result2);

    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        return !isOdd(number);
    }
}

/*
1.1 Create a method named isOdd that returns true if a number is odd.
Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even.
	Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true


 */
