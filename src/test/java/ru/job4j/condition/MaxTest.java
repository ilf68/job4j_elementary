package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2To5Then5() {
        assertThat(Max.max(1, 2, 5), is(5));
    }

    @Test
    public void whenMax6To4Then6() {
       assertThat(Max.max(6, 4), is(6));
    }

    @Test
    public void whenMax7To7Then7() {
        assertThat(Max.max(7, 7), is(7));
    }

    @Test
    public void whenMax1To15To8To5Then15() {
        assertThat(Max.max(1, 15, 8, 5), is(15));
    }
}