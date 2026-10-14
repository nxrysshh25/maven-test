package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class appTest {
    @Test
    public void testPalindrome() {
        assertTrue(new app().isPalindrome(121));
    }

    @Test
    public void testNotPalindrome() {
        assertTrue(new app().isPalindrome(123));
    }

    @Test
    public void testSingleDigit() {
        assertTrue(new app().isPalindrome(7));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(new app().isPalindrome(-121));
    }
}
