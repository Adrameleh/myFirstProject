package homework.lesson1;

public class Main {
    public static void main(String[] args) {
        double money = 1000;
        double pizzaPrice = 230;
        double gumPrice = 26;
        double candyPrice = 2.5;
        int count = 0;

        while (money >= pizzaPrice) {  // pizza
            money = money - pizzaPrice;
            count++;
        }
        System.out.print(count);
        System.out.println(" pizzas");
        count = 0;

        while (money >= gumPrice) {
            money = money - gumPrice;
            count++;
        }
        System.out.print(count);
        System.out.println(" gums");
        count = 0;

        while (money >= candyPrice) {
            money = money - candyPrice;  // int money, double candy   money=(int)(money/candy)
            count++;
        }
        System.out.print(count);   //sout ("can buy = "+count);
        System.out.println(" candy");

        System.out.print("change = ");
        System.out.println(money);
    }
}
