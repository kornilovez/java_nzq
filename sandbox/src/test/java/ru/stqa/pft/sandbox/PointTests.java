package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testPoint() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, -2);
        Assert.assertEquals(p1.distance(p2), 3.605551275463989);
    }
}
