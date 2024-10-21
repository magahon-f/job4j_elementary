package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to56then5dot66() {
        Point a = new Point(1, 2);
        Point b = new Point(5, 6);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when7minus3toMinus93then17dot08() {
        Point a = new Point(7, -9);
        Point b = new Point(-3, 3);
        double expected = 15.62;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to511to93then2() {
        Point a = new Point(1, 5, 9);
        Point b = new Point(8, 11, 3);
        double expected = 11;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to78to1010then1dot41() {
        Point a = new Point(0, 7, 10);
        Point b = new Point(0, 8, 11);
        double expected = 1.41;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when7minus3toMinus93to55then15dot62() {
        Point a = new Point(7, -9, 5);
        Point b = new Point(-3, 3, 5);
        double expected = 15.62;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to00to00then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}