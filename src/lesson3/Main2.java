package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[8];


        int evennumber = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = evennumber;
            evennumber += 2;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
