package day06_method_practice;

public class DayAndMonth { //custom method
    public static void main(String[] args) {
        day(5);
        monthName(6);
        daysInMonth(6);
    }
    public static void day(int day) { // parameter must have information (int day)
        if (day >= 1 && day <= 7) {
            System.out.println((day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
                    : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday");

        } else {
            System.out.println("Invalid day");

        } /*Switch statement
        public static String day (int num){
        String name = " ";
        switch (day) {
        case 1 -> name = "Monday";
        case 2 -> name = "Tuesday";
        case 3 -> name = "Wednesday";
        case 4 -> name = "Thursday";
        case 5 -> name = "Friday";
        case 6 -> name = "Saturday";
        case 7 -> name = "Sunday";
        default -> name = "Invalid day";

        return name;
         */

    }
    public static void monthName(int month) {
        String result = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(result);
        /*
        Nested if:
        public static void monthName(int num){
        String name = "Invalid month "; -> set as temp value instead of using }else{

        if (num >= 1 && num <= 12){
        name = (num == 1)? "January" :(num == 2)? "Feb" :(num == 3)? "March" :(num == 4)? "April" :(num == 5)? "May"
        :(num == 6)? "June" :(num == 7)? "July" :(num == 8)? "August" :(num == 9)? "September" :(num == 10)?
        "October" :(num == 11)? "November" : "December";
        }
        return name;

         */
    }

    public static void daysInMonth(int month) {
        switch (month) {
            case 2 -> System.out.println("28 days");

            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");

            case 4, 6, 9, 11 -> System.out.println("30 days");

            default -> System.out.println("Invalid date");

            /*
            public static void dayInMonth(int num){
            String monthName = monthName(num);
            int days = 0;
            if (num == 2){
            days = 28;

            if (num == 4 || num == 6 || num == 9 || num == 11){
            days = 30;

            }else{
            days = 31;

            System.out.println(monthName + "has" + days + "days");
            return days; //<-if requirement change to make it re-use able has to return the method
             */


        }
    }
}

/*
3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

 */