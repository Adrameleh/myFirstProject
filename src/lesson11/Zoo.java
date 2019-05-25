package lesson11;

public class Zoo {
    private int money;
    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {
    }

    ;

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyAnimal(ZooAnimal animal) {
        if (money < animal.getPrice()) {
            System.out.println("Not enough money");
            return;
        }


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                this.money -= animal.getPrice();
                animals[i] = animal;
                return;
            }
        }
        System.out.println("not enough place");
    }

    public void printAnimals() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();
            }
        }
    }

    public void printMaxPrice() {
        ZooAnimal maxPriceAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && maxPriceAnimal.getPrice() < animals[i].getPrice()) {
                maxPriceAnimal = animals[i];
            }
        }
        System.out.print("The most expensive animal is ");
        maxPriceAnimal.printInfo();
    }

    public void printMinPrice() {
        ZooAnimal minPriceAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && minPriceAnimal.getPrice() > animals[i].getPrice()) {
                minPriceAnimal = animals[i];
            }
        }
        System.out.print("The cheapest animal is ");
        minPriceAnimal.printInfo();
    }

    public void fullPrice() {
        int fullPrice = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                fullPrice += animals[i].getPrice();
            }
        }
        System.out.println("Full price of the zoo is " + fullPrice);
    }

    public void maxWeight() {
        ZooAnimal maxWeightAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && maxWeightAnimal.getWeight() < animals[i].getWeight()) {
                maxWeightAnimal = animals[i];
            }
        }
        System.out.print("Animal with maximum weight is ");
        maxWeightAnimal.printInfo();
    }

    public void printMoney() {
        System.out.println(money + " left");
    }
}