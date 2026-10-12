package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3));
    }

    @Test
    public void testAddZero() {
        App app = new App();
        assertEquals(7, app.add(7, 0));
    }
}