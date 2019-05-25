package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 9;
        //String input = "xcvbn";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String inputName = scanner.nextLine();
        System.out.println("Hello, " + inputName);
        System.out.println();

        System.out.println("Input first side of triangle");
        int sideA = scanner.nextInt();

        System.out.println("Input second side of triangle");
        int sideB = scanner.nextInt();

        System.out.println("Input third side of triangle");
        int sideC = scanner.nextInt();

        System.out.println("square or perimeter?");
        String action = scanner.next();


        if (action.equals("perimeter")) {
            System.out.println("perimeter = " + (sideA + sideB + sideC));
        } else {
            if (action.equals("square")) {
                double halfPerim = (double) (sideA+sideB+sideC)/2;
                System.out.println("square = " + (Math.sqrt(halfPerim*(halfPerim-sideA)*(halfPerim-sideB)*(halfPerim-sideC))));
            }
        }

    }
}
