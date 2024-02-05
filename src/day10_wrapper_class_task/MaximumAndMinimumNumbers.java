package day10_wrapper_class_task;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};

        int max = list[0];
        int min = list[0];

        for (int each : list) {
            if(each > max){
                max = each;

                }
            if(each < min) {
                min = each;

            }
            }
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);

        }
    }

/*
Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1

 */
