package day10_wrapper_class_task;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        ArrayList<String> arrList1 = new ArrayList<>();
        arrList1.addAll(Arrays.asList("A", "B", "C"));

        ArrayList<String> arrList2 = new ArrayList<>();
        arrList2.addAll(Arrays.asList("D", "E", "F", "G"));

        ArrayList<String> arrList3 = new ArrayList<>();
        arrList3.addAll(arrList1);
        arrList3.addAll(arrList2);

        System.out.println(arrList3);
    }
}
/*
 Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */