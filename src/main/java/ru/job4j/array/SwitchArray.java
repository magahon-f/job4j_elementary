package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int last = array.length - 1;
        int temp = array[0];
        array[0] = array[last];
        array[last] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
