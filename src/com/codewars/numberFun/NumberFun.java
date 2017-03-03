package com.codewars.numberFun;

public class NumberFun {
	public static long findNextSquare(long sq) {

		if (Math.sqrt(Math.abs(sq)) != Math.ceil(Math.sqrt(Math.abs(sq)))) {
			return -1;
		}
		sq++;

		while (isSqr(sq)) {
			sq++;
		}
		return sq;
	}

	public static boolean isSqr(long numSq) {

		if (Math.sqrt(numSq) != Math.ceil(Math.sqrt(numSq))) {
			return true;
		}
		return false;
	}

}
