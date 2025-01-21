package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength5AndWidth7ThenDiagonal8dot6() {
        double length = 5;
        double width = 7;
        double expected = 8.6;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength9AndWidth12ThenDiagonal15() {
        double length = 9;
        double width = 12;
        double expected = 15.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength9AndWidth20ThenDiagonal521dot93() {
        double length = 9;
        double width = 20;
        double expected = 21.93;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
