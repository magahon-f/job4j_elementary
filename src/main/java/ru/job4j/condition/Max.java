package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int forth) {
        return max(max(first, second), max(third, forth));
    }

    public static void main(String[] args) {
        System.out.println(max(7, 6, 7, 4));
    }
}
