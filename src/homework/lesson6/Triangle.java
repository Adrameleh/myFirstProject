package homework.lesson6;

public class Triangle {
    public static double triangleSquareThreeSides(double sideA, double sideB, double sideC){
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }


}
