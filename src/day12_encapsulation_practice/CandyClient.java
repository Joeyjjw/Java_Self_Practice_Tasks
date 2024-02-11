package day12_encapsulation_practice;

public class CandyClient {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Jelly beans",-10, 0.0,true );

        Candy candy2 = new Candy("M&M", 60, 6.1, false);

        System.out.println(candy1);
        System.out.println(candy2);
    }
}
