package day11_class_and_object;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 2, 4);

        System.out.println("Pizza1 = " + pizza1);

        Pizza pizza2 = new Pizza("medium", 4, 5);

        System.out.println("Pizza2 = " + pizza2);

        Pizza pizza3 = new Pizza("large", 3, 4);
        System.out.println("Pizza3 = " + pizza3);
    }
}
