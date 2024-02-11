package day13_inheritance_practice.state_task;

public class StateClient {
    public static void main(String[] args) {


        Virginia virginia = new Virginia("Virginia", "VA", "Republican", "Glenn Youngkin", "Mark Warner", 8_642_000);
        Texas texas = new Texas("Texas", "TX", "Republican Party", "Greg Abbott", "Ted Cruz", 29_530_000);
        Florida florida = new Florida("Florida", "FL", "Republian party", "Ron DeSantis", "Rick Scott", 21_780_000);
        California california = new California("California", "CA", "Democratic Party", "Gavin Newsom", "Alex Padilla", 39_240_000);

        System.out.println(virginia);
        System.out.println(texas);
        System.out.println(florida);
        System.out.println(california);
    }

}

/*
Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.

 */
