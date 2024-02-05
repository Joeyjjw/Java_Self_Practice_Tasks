package day04_selection_statement;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 3;

        if (selection == 1) {
            System.out.println("Hello, thank you for your call");

        }else if (selection == 2){
            System.out.println("Hola, gracias por llamar");
        }else if (selection == 3){
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }else if (selection == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }else{
            System.out.println("Merci, pour votre appel");
        }

    }
}


/*
Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler

 */