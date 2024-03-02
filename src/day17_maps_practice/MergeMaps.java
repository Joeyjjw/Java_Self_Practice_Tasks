package day17_maps_practice;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

        public static void main(String[] args) {
            Map<String, Integer> map1 = new HashMap<>();
            map1.put("A", 10);
            map1.put("B", 20);

            Map<String, Integer> map2 = new HashMap<>();
            map2.put("B", 30);
            map2.put("C", 40);

            // If key already exists in mergedMap, add the values together
            Map<String, Integer> mergedMap = new HashMap<>(map1);
            map2.forEach((key, value) -> mergedMap.merge(key, value, Integer::sum));

            System.out.println(mergedMap);


        }
}

/*
3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */
