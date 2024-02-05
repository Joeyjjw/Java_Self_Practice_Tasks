package day10_wrapper_class_task;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;

        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    upperCase++;
                } else {
                    lowerCase++;
                }
            }
        }
        boolean result = upperCase == lowerCase;
        System.out.println(result);
    }
}
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eample:
	            str = "JAVA java";

	        output:
	            true
 */
