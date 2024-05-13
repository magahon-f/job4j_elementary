package ru.job4j.calculator;

public class Calculator {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;

    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(ONE, TWO));
        System.out.println("6 / 2 = " + divide(SIX, TWO));
        System.out.println("5 - 2 = " + subtract(FIVE, TWO));
        System.out.println("4 * 2 = " + multiply(FOUR, TWO));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
