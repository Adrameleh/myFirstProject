package homework.lesson9;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {

    }

    public Triangle(double newSideA) {
        sideA = newSideA;
    }

    public Triangle(double newSideA, double newSideB) {
        sideA = newSideA;
        sideB = newSideB;
    }

    public Triangle(double newSideA, double newSideB, double newSideC) {
        sideA = newSideA;
        sideB = newSideB;
        sideC = newSideC;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double newSideC) {
        sideC = newSideC;
    }
}
