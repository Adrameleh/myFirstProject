package lesson2;

public class Main5 {
    public static void main(String[] args, String not_a_mark) {
        int mark = 4;

        if (mark == 2) {
            System.out.println("bad");
        } else if (mark == 3) {
            System.out.println("mediocre");
        } else if (mark == 4) {
            System.out.println("good");
        } else if (mark == 5) {
            System.out.println("perfect");
        } else {
            System.out.println("not a mark");
        }

    }
}
