package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        int result = max(temp, third);
        return result;
    }

    public static int max(int first, int second, int third, int forth) {
        int tempFirst = max(first, second);
        int tempSecond = max(third, forth);
        int result = max(tempFirst, tempSecond);
        return result;
    }

    public static void main(String[] args) {
        int res = max(7, 6, 7, 4);
        System.out.println(res);
    }
}
