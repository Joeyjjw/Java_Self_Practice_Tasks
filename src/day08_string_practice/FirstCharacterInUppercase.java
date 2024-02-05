package day08_string_practice;


public class FirstCharacterInUppercase {
    public static void main(String[] args) {
        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        String formattedFullName = formatFullName(firstName, lastName);
        System.out.println("FormattedFullName: " + formattedFullName);
    }
    public static String formatFullName(String firstName, String lastName) {
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

    }
}
/*
Write a program that asks the user to enter first and last names
and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */