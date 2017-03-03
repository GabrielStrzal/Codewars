package com.codewars.twotoone;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoToOneTest {

	@Test
	public void testSeExistemIguais() {
		assertEquals("abcef", TwoToOne.longest("abcabcaa", "ef"));

	}

	@Test
	public void testOrdena() {
		assertEquals("abcef", TwoToOne.longest("abcabcaa", "ef"));

	}

	@Test
	public void test1() {
		System.out.println("longest Fixed Tests");
		assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));

	}

	@Test
	public void test2() {
		assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
	}

	@Test
	public void test3() {
		assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
	}

}
