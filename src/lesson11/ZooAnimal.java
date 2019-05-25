package lesson11;

public abstract class ZooAnimal {
    private int price;
    private int weight;

    public ZooAnimal() {
    }

    public ZooAnimal(int price) {
        this.price = price;
    }

    public ZooAnimal(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void voice();

    public abstract void printInfo();

    public abstract void jump();
}
