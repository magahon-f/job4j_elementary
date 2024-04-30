package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double result = Math.pow(p, 2) * (k / (2 * (k + 1))) * (1 / (2 * (k + 1)));
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
