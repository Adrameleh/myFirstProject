package homework.lesson3;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of first side");
        int sideA = scanner.nextInt();

        System.out.println("Input length of second side");
        int sideB = scanner.nextInt();

        System.out.println("Input acute angle");
        double angleDegrees = scanner.nextDouble();

        System.out.println("square or perimeter?");
        String action = scanner.next();

        double angleRadians = Math.toRadians(angleDegrees);
        double angleSin = Math.sin(angleRadians);

        if (action.equals("perimeter")) {
            System.out.println("perimeter = " + ((sideA + sideB) * 2));
        } else {
            if (action.equals("square")) {
                System.out.println("square = " + (sideA * sideB * angleSin));
            }
        }
    }
}
