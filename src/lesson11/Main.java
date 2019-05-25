package lesson11;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100000);
        Tiger tiger = new Tiger(20000, 200);
        Parrot parrot1 = new Parrot(40000, 1);
        Parrot parrot2 = new Parrot(10000, 1);
        Monkey monkey1 = new Monkey(20000, 15);
        Monkey monkey2 = new Monkey(12000, 25);

        zoo.buyAnimal(parrot1);
        zoo.buyAnimal(parrot2);
        zoo.buyAnimal(monkey2);
        zoo.buyAnimal(tiger);
        zoo.buyAnimal(monkey1);

        zoo.printAnimals();
        zoo.voice();
        zoo.printMaxPrice();
        zoo.fullPrice();
        zoo.printMinPrice();
        zoo.maxWeight();
        zoo.printMoney();
    }
}
