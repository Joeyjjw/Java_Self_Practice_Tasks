package day17_maps_practice;

import java.util.*;

public class UniqueCharacters {



        public static void main(String[] args) {

            String str1 = "aabcccdeeeef";

            Map<String, Integer> map = new LinkedHashMap<>();

            for (String each : str1.split("")) {
                int frequency = Collections.frequency(Arrays.asList(str1.split("")), each);
                if(frequency == 1) { //if its =1 , then its unique
                    map.put(each, frequency);
                }


            }
            System.out.println(map);
    }

    }


/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}

 */