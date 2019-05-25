package homework.lesson3;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of one side");
        int side = scanner.nextInt();

        System.out.println("square or perimeter?");
        String action = scanner.next();


        if (action.equals("perimeter")) {
            System.out.println("perimeter = " + (side * 6));
        } else {
            if (action.equals("square")) {
                System.out.println("square = " + (3 * Math.sqrt(3) / 2 * side * side));
            }
        }
    }
}
