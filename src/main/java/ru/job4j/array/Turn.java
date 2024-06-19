package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int source = 0; source < array.length / 2; source++) {
            int destination = array.length - source - 1;
            int temp = array[source];
            array[source] = array[destination];
            array[destination] = temp;
        }
        return array;
    }
}
