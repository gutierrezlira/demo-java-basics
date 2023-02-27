package by.itacademy.alinadarenskikh.javabasics;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Неправильное количество аргументов");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];

        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Деление на ноль невозможно.");
                } else {
                    result = (double) a / b;
                    break;
                }
        }
        System.out.println(result);
    }
}
