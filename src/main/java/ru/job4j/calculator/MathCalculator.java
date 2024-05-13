package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAllFunctions(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractAndDivide равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета sumAllFunctions равен: " + sumAllFunctions(10, 20));
    }

}
