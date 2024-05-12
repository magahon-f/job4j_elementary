package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        System.out.println(output);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman167Then77() {
        short input = 167;
        double expected = 77;
        double output = Fit.manWeight(input);
        System.out.println(output);
        assertThat(output).isEqualTo(expected, withPrecision(0.05));
    }
}