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

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To5Then0() {
        int start = 5;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To10Then10() {
        int start = 10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus5To10Then24() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5ToMinus10Then0() {
        int start = 5;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus1ToMinus10Then0() {
        int start = -1;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10ToMinus1ThenMinus30() {
        int start = -10;
        int finish = -1;
        int result = Counter.sumByEven(start, finish);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }
}