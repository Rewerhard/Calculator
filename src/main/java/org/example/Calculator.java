package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {
        String input;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            input = reader.readLine();
        }
        System.out.println(calc(input));
    }
    public static String calc(String input) throws Exception {
        String[] array = input.trim().split(" ");
        if (array.length != 3) {
            System.out.println("Формат математической операции не удовлетворяет заданию");
            throw new Exception();
        }
        if (array[0].chars().allMatch(Character::isDigit)){
          return Arabian.arabCalc(array);
        } else {
          return Roman.romeCalc(array);
        }
    }
}