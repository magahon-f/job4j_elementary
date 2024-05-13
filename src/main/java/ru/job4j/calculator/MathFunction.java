package ru.job4j.calculator;

public class MathFunction {
    public static int squarePlusOne(int x) {
        return x * x + 1;
    }

    public static int inverse(int x) {
        if (x == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return 1 / x;
    }

    public static void main(String[] args) {
        try {
            int result1 = MathFunction.squarePlusOne(3);
            int result2 = MathFunction.inverse(5);
            int total = result1 + result2;
            System.out.println("Total: " + total);
            int result3 = MathFunction.squarePlusOne(100);
            System.out.println("Result of squarePlusOne(100): " + result3);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
