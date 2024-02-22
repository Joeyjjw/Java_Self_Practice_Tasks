package day16_collections_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

       Set<Character> set1 = new HashSet<>();

        for (char c1 : str1.toCharArray()) {
            set1.add(c1);

        }

       Set<Character> set2 = new LinkedHashSet<>();
        for (char c2 : str2.toCharArray()) {
            set2.add(c2);

        }
        boolean result = set1.equals(set2);
        System.out.println(result);

        String str3 = "xyze";
        String str4 = "xyzd";

        Set<Character> set3 = new HashSet<>();
        for (char c3 : str3.toCharArray()) {
            set3.add(c3);

        }
        Set<Character> set4 = new HashSet<>();
        for (char c4 : str4.toCharArray()) {
            set4.add(c4);

        }
        boolean result2 = set3.equals(set4);
        System.out.println(result2);


    }


}

/*
5. Create a class named Anagram and write a program that checks if two strings are
anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */
