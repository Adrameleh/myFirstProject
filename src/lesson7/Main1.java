package lesson7;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Which operation?");
        String operation = Calculator.getOperation();

        System.out.println("Input first number");

        int num1 = Calculator.getNumber();

        System.out.println("Input second number");

        int num2 = Calculator.getNumber();

        Calculator.printResult(operation, num1, num2);

    }
}
