package com.codewars.rotateForMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxRotateTest {

	private static void assertEqualLongs(long actual, long expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		System.out.println("Fixed Tests maxRot");
		assertEqualLongs(MaxRotate.maxRot(38458215), 85821534);
		assertEqualLongs(MaxRotate.maxRot(195881031), 988103115);
		assertEqualLongs(MaxRotate.maxRot(896219342), 962193428);
		assertEqualLongs(MaxRotate.maxRot(69418307), 94183076);
		assertEqualLongs(MaxRotate.maxRot(16130873362142L), 94183076);
	}

}
