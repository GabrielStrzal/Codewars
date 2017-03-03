package com.codewars.rotateForMax;

public class MaxRotate {
	public static long maxRot(long n) {
		System.out.println("**************");
		System.out.println(n);
		System.out.println("**************");
		String x_str = Long.toString(Math.abs(n));
		String resutString = "";
		int x_length = x_str.length();
		long finalLong = Math.abs(n);
		for (int i = 0; i < x_length; i++) {

			String buffInt = x_str.substring(0, 1);
			x_str = x_str + buffInt;
			x_str = x_str.substring(1);
			resutString = resutString + x_str.substring(0, 1);
			x_str = x_str.substring(1);

			long longInterno = Long.parseLong(resutString + x_str);
			System.out.println(longInterno);
			if (finalLong < longInterno) {
				finalLong = longInterno;
			}

		}

		return finalLong;
	}
}
