package org.example;

class Arabian {
    public static String arabCalc(String... strings) throws Exception {
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
        } catch (NumberFormatException e) {
            System.out.println("Введите положительные числа от 1 до 10");
            throw new NumberFormatException();
        }
        if (a < 1 || b < 1 || a * b > 100) {
            System.out.println("Введите положительные числа от 1 до 10");
            throw new Exception();
        }
        return String.valueOf(Operation.operation(a, b, strings[1]));
    }
}
