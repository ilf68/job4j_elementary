package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenStartWithPrefixNullThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenStartWithPrefixNullBigerThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e', 'l', 'l', 'o', 'A'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }
}