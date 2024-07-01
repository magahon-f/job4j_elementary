package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3elements() {
        int[] data = new int[] {30, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 30};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort11elements() {
        int[] data = new int[] {9, 5, 1, 2, 11, 7, 3, 10, 4, 6, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        assertThat(result).containsExactly(expected);
    }
}