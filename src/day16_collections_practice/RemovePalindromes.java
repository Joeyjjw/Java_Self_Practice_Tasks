package day16_collections_practice;

import java.util.*;

public class RemovePalindromes {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));

        List<String> isPalindrome = new ArrayList<>();
        for (String eachWord : list) {
            String reversedStr = "";
            for (int length = eachWord.length()-1; length >= 0; length--) {
                reversedStr += eachWord.charAt(length);

            }
            if(!eachWord.equalsIgnoreCase(reversedStr)) {
                isPalindrome.add(eachWord);
            }
            }
            System.out.println(isPalindrome);


        }


    }



/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}

 */