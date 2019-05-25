package homework.lesson9;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle() {

    }

    public Rectangle(double newSideA) {
        sideA = newSideA;
    }

    public Rectangle(double newSideA, double newSideB) {
        sideA = newSideA;
        sideB = newSideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double newSideA) {
        sideA = newSideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double newSideB) {
        sideB = newSideB;
    }
}
