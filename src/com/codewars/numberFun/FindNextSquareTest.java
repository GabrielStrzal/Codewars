package com.codewars.numberFun;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNextSquareTest {

	@Test
    public void testNextSquareOf121() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }
    
    @Test
    public void testNextSquareOf625() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }
    
    @Test
    public void testNextSquareOf114() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
    

}
