package day09_arrays_task;
import java.util.Arrays;
import java.util.Scanner;
public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"Joey", "Shay", "Laila", "Jason", "Jala", "Mike", "Julia", "Sam", "Bobby", "Autumn"};


        for (int i = 0; i < names.length; i++) {

           String initials = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ") + 1);

            System.out.print(initials);

        }


    }


}
/*
Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */