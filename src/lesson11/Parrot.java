package lesson11;

public class Parrot extends ZooAnimal{

    public Parrot() {
        super();
    }

    public Parrot(int cost) {
        super(cost);
    }

    public Parrot(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("arararra");
    }

    @Override
    public void printInfo() {
        System.out.println("Parrot with cost = " + this.getPrice() + " and weight = " + this.getWeight());
    }

    @Override
    public void jump() {
        System.out.println("Parrot jumps");
    }
}
