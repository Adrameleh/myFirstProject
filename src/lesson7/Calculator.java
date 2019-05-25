package lesson7;

import java.util.Scanner;

public class Calculator {
    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String inputAction = scanner.nextLine();
        if (inputAction.equals("-") || inputAction.equals("+") || inputAction.equals("*") || inputAction.equals("/")) {
            return inputAction;
        } else {
            System.out.println("Wrong, repeat pls");
            return Calculator.getOperation();
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] charsInputNumber = inputNumber.toCharArray();

        for (char current : charsInputNumber) {
            if (current != '1' && current != '2' && current != '3'
                    && current != '4' && current != '5' && current != '6'
                    && current != '7' && current != '8' && current != '9'
                    && current != '0') {
//                isNumber = false;
                System.out.println("Wrong, repeat pls");
                return Calculator.getNumber();
//
            }
        }

        return Integer.parseInt(inputNumber);
    }

    public static void printResult(String operation, int num1, int num2){
        switch (operation){
            case "+":
                System.out.println((num1+num2));
                break;
            case "-":
                System.out.println((num1-num2));
                break;
            case "*":
                System.out.println((num1*num2));
                break;
            case "/":
                System.out.println((num1/num2));
                break;
        }
    }
}
