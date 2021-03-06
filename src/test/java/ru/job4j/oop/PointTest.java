package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        double expected = 39.01;
        Point a = new Point(41, 41);
        Point b = new Point(42, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        double expected = 4.47;
        Point a = new Point(0, 0, 7);
        Point b = new Point(4, 2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        double expected = 13.92;
        Point a = new Point(17, 6, 7);
        Point b = new Point(4, 11, 77);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}