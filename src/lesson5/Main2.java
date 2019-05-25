package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {-1, -3, -88, -10000, -9, -3, -343, 3242};
        int max = Integer.MIN_VALUE;
        int lessThanMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                lessThanMax = max;
                max = array[i];
            } else {
                if (array[i] > lessThanMax) {
                    lessThanMax = array[i];
                }
            }

        }
        System.out.println(lessThanMax + " " + max);
    }
}
