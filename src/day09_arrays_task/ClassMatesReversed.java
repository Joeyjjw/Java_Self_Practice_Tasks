package day09_arrays_task;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classNames = {"Joey", "Shay", "Laila", "Jason", "Jala", "Mike", "Julia", "Sam", "Bobby", "Autumn"};

        for (int i = 0; i < classNames.length; i++) {
            String name = classNames[i];
            String reverseName = " ";

            for (int each = name.length()-1; each >= 0; each--) {
                reverseName += name.charAt(each);

            }
            System.out.println(reverseName);

        }
    }
}
/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */