package ru.job4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.converter.Converter;

import static org.assertj.core.api.Assertions.*;

public class MainTest {
    @Test
        void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen3dot3333Euro() {
    }
    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}
