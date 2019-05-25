package lesson11;

public class Tiger extends ZooAnimal {
    public Tiger() {
        super();
    }

    public Tiger(int cost) {
        super(cost);
    }

    public Tiger(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("RRRRR");
    }

    @Override
    public void printInfo() {
        System.out.println("Tiger with cost = " + this.getPrice() + " and weight = " + this.getWeight());
    }

    @Override
    public void jump() {
        System.out.println("Tiger jumps");
    }

}
