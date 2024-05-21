package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumFrom0to10is55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumFrom10to100is5005() {
        int start = 10;
        int finish = 100;
        int expected = 5005;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumFrom5to5is5() {
        int start = 5;
        int finish = 5;
        int expected = 5;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumFrom5to1is0() {
        int start = 5;
        int finish = 1;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumFromMinus5to5is0() {
        int start = -5;
        int finish = 5;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }
}