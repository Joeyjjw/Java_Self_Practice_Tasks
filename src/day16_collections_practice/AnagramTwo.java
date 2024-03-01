package day16_collections_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AnagramTwo {
    public static void main(String[] args) {

        String str1 = "xyze";
        String str2 = "xyzd";

        Set<String> s1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> s2 = new TreeSet<>(Arrays.asList(str2.split("")));

        boolean isAnagram = s1.equals(s2);

        System.out.println("Is Anagram = "  + isAnagram);


        String str3 = "abcd";
        String str4 = "ccddabaa";

        Set<String> s3 = new TreeSet<>(Arrays.asList(str3.split("")));
        Set<String> s4 = new TreeSet<>(Arrays.asList(str4.split("")));

        boolean isAnagram2 = s3.equals(s4);

        System.out.println("IS Anagram 2 = " + isAnagram2);
    }
}
