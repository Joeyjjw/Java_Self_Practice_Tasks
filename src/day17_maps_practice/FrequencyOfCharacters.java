package day17_maps_practice;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {

            if(map.containsKey(each)){
                map.put((each), map.get(each)+1);
            }else{
                map.put((each),1);
            }
        }

        System.out.println(map);

    }
}

/*
4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */