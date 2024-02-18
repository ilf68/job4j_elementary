package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    public void when34to2i20then16Dot03() {
        Assert.assertEquals(16.03, new Point(3, 4).distance(new Point(2, 20)), 0.01);
    }

    @Test
    void when55to10i10then7Dot07() {
        Assert.assertEquals(7.07, new Point(5, 5).distance(new Point(10, 10)), 0.01);
    }

    @Test
    void when7Minus5to7i10then15Dot0() {
        Assert.assertEquals(15, new Point(7, -5).distance(new Point(7, 10)), 0.01);
    }

    @Test
    void when3d_1() {
        Assert.assertEquals(4.0,
                new Point(0, 0, 0).distance3d(new Point(0, 0, 4)), 0.01);
    }
    @Test
    void when_3d_2() {
        Assert.assertEquals(11.49,
                new Point(0, 0, 0).distance3d(new Point(10, 4, 4)), 0.01);
    }
}
