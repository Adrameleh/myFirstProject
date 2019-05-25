package homework.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("part A");

        for (int i = 0; i >= -20; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("part B");

        for (int i = 500; i <= 1000; i++) {
            if ((i % 7) == 0 && (i % 19 == 0)) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("part C");
        int sum = 0;
        for (int i = 50; i <= 1000; i ++) {
            if ((i % 7) == 0 && (i % 19 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("part D");
        for (int i = 10; i <= 30; i++) {
            if (i != 21 && i != 22 && i != 23 && i != 24) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("part E");
        for (int i = 100; i >= 90; i--) {
            System.out.println(i);
        }
    }
}
