package day16_collections_practice;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

       // Set<Integer> set = new LinkedHashSet<>();
        //set.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        //Set<Integer> set = new TreeSet<>(list);

        //System.out.println(set);


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        Collections.sort(numbers);
        removeDuplicates(numbers);
        System.out.println("Output in order: " + numbers);

    }
    public static void removeDuplicates(List<Integer> numbers){
        List<Integer> uniqueNumber = new ArrayList<>();
        for (Integer each : numbers) {
            if(uniqueNumber.contains(each)){
                continue;
            }
            uniqueNumber.add(each);
        }
        numbers.clear();
        numbers.addAll(uniqueNumber);
    }

}
;
/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */
