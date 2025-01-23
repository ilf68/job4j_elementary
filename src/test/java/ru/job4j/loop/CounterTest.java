package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumFrom10To12Then33() {
        int start = 10;
        int finish = 12;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumFrom3To21Then228() {
        int start = 3;
        int finish = 21;
        int expected = 228;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumFrom3To1Then0() {
        int start = 3;
        int finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To12Then22() {
        int start = 10;
        int finish = 12;
        int expected = 22;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To21Then108() {
        int start = 3;
        int finish = 21;
        int expected = 108;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10To3ThenMinus28() {
        int start = -10;
        int finish = 3;
        int expected = -28;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}