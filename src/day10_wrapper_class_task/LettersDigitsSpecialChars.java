package day10_wrapper_class_task;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String digits = "", letters = "", specialChars = "";

        //for (int i = 0; i < str.length(); i++) {
           // char eachChar = str.charAt(i);

        for (char eachCharacter : str.toCharArray()) {//use for each loop with data structure
            if(Character.isDigit(eachCharacter)){
                digits += eachCharacter;
            }else if(Character.isLetter(eachCharacter)){
                letters += eachCharacter;
            }else{
                specialChars += eachCharacter;
            }

        }
        System.out.println("Letters = " + letters);
        System.out.println("Digit = " + digits);
        System.out.println("SpecialChars = " + specialChars);

        }

    }

/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */