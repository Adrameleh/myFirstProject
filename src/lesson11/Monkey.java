package lesson11;

public class Monkey extends ZooAnimal {

    public Monkey() {
        super();
    }

    public Monkey(int cost) {
        super(cost);
    }

    public Monkey(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("ayayayya");
    }

    @Override
    public void printInfo() {
        System.out.println("Monkey with cost = " + this.getPrice() + " and weight = " + this.getWeight());
    }

    @Override
    public void jump() {
        System.out.println("Monkey jumps");
    }
}
