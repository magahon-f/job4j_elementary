package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = distance(5, 8, 0, 3);
        System.out.println("result (5, 8) to (0, 3) " + result);
        result = distance(25, 7, 7, 34);
        System.out.println("result (25, 7) to (7, 34) " + result);
        result = distance(99, 100, 99, 100);
        System.out.println("result (99, 100) to (99, 100) " + result);
    }
}
