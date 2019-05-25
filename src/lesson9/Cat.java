package lesson9;

public class Cat {
    private String poroda;
    private int age;
    private double tailLength;


    public Cat() {

    }

    public Cat(int newAge, String newPoroda, double newTailLength) {
        poroda = newPoroda;
        age = newAge;
        tailLength = newTailLength;
    }


    public void setPoroda(String newPoroda) {
        poroda = newPoroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setTailLength(double newTailLength) {
        tailLength = newTailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}
