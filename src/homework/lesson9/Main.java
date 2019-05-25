package homework.lesson9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.setRadius(5.5);
        System.out.println(circle.getRadius());

        rectangle.setSideA(5.2);
        System.out.println(rectangle.getSideA());
        rectangle.setSideB(4.3);
        System.out.println(rectangle.getSideB());

        square.setSide(4.6);
        System.out.println(square.getSide());

        triangle.setSideA(4.6);
        System.out.println(triangle.getSideA());
        triangle.setSideB(3.2);
        System.out.println(triangle.getSideB());
        triangle.setSideC(6.9);
        System.out.println(triangle.getSideB());
    }
}
