package org.example;

class Operation {
    public static int operation(int a, int b, String operator) throws Exception {
        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> {
                System.out.println("Введите правильный оператор +-*/");
                throw new Exception();
            }
        };
        return result;
    }
}
