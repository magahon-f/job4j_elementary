package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int last = array.length - 1;
        int temp = array[0];
        array[0] = array[last];
        array[last] = temp;
        for (int source = 1; source < last - source; source++) {
            int destination = last - source;
            temp = array[source];
            array[source] = array[destination];
            array[destination] = temp;
        }
        return array;
    }
}
