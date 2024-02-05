package day03_operators_practice;

public class Task2 {
    public static void main(String[] args) {
        String information = "can I vote in this election?";
        int yourAge = 18;

        information += yourAge > 18? "absolutely YES." : "unfortunately," +
                "you should wait a bit";

        System.out.println(information);
    }
}
