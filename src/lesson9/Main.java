package lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setPrice(10000);
        saomi.setPrice(8000);

        System.out.println(meizu.getPrice());

        meizu.setDiagonal(5.7);
        saomi.setDiagonal(6.9);

        System.out.println(meizu.getDiagonal());
        System.out.println(saomi.getDiagonal());

        meizu.setModel("QZ250");

        System.out.println(meizu.getModel());
    }
}
