package homework.lesson6;

public class AllResults {
    public static void main(String[] args) {
        double sideA = 10;
        double sideB = 5;
        double sideC = 7;
        double triangleSquare = Triangle.triangleSquareThreeSides(sideA,sideB,sideC);

        System.out.println(triangleSquare);

        int[] massive = {0,4,5,6,7,8,3,1,9,0};

        PrintFromMassive.even(massive);

        Fractions.sum(10,15,15,3);
    }
}
