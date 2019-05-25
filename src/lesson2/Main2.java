package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrice = 230;
        int gumPrice = 26;
        double candyPrice = 2.5;

        int changeAfterPizza = money % pizzaPrice;
        System.out.println(changeAfterPizza);
        System.out.println(changeAfterPizza++);  //important where is '++' because of order, easier to wright in two
        System.out.println(changeAfterPizza);

        pizzaPrice=pizzaPrice+5; // shorter, looks better, but i think harder to understand pizzaPrice+=5;
    }
}
