package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1to2then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5to2then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5to5then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to2to3then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to3to2then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3to1to2then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3to1to3then3() {
        int first = 3;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to2to3to4then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to2to4to3then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int forth = 3;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to4to3to2then4() {
        int first = 1;
        int second = 4;
        int third = 3;
        int forth = 2;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4to2to3to1then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4to2to3to4then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}