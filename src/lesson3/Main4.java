package lesson3;

public class Main4 {
    public static void main(String[] args) {

        int[] massive = {3, 7, 4, 9, 6, 20};
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }
        System.out.println(sum);
    }
}
