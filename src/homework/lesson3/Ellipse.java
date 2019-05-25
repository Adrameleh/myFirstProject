package homework.lesson3;

import java.util.Scanner;

public class Ellipse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of first axis");
        int axisA = scanner.nextInt();

        System.out.println("Input length of second axis");
        int axisB = scanner.nextInt();

        System.out.println("square or perimeter?");
        String action = scanner.next();

        double halfA = (double) axisA / 2;
        double halfB = (double) axisB / 2;

        if (action.equals("perimeter")) {
            System.out.println("perimeter = " + (4 * ((3.14 * halfA * halfB + (halfA - halfB) * (halfA - halfB)) / (halfA + halfB))));
        } else {
            if (action.equals("square")) {
                System.out.println("square = " + (3.14159 * halfA * halfB));
            }
        }
    }
}
