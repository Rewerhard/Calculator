package org.example;

 class Roman {
    public static String romeCalc(String... strings) throws Exception {
        int a = 0;
        int b = 0;
        try {
            a = RomanNumbers.valueOf(strings[0]).getI();
            b = RomanNumbers.valueOf(strings[2]).getI();
        } catch (IllegalArgumentException e) {
            System.out.println("Введите положительные числа от I до X");
            throw new Exception(e);
        }
        return intToRoman(Operation.operation(a, b, strings[1]));
    }

    public static String intToRoman(int num) throws Exception {
        if (num < 1) {
            System.out.println("Результат меньше I");
            throw new Exception();
        }
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }
}
