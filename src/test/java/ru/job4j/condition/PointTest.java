package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    void when34to2i20then16Dot03() {
        double expected = 16.03;
        int x1 = 3;
        int y1 = 4;
        int x2 = 2;
        int y2 = 20;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when55to10i10then7Dot07() {
        double expected = 7.07;
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when7Minus5to7i10then15Dot0() {
        double expected = 15;
        int x1 = 7;
        int y1 = -5;
        int x2 = 7;
        int y2 = 10;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test

    void when25i45to19Minus48then93Dot19() {
        double expected = 93.19;
        int x1 = 25;
        int y1 = 45;
        int x2 = 19;
        int y2 = -48;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}