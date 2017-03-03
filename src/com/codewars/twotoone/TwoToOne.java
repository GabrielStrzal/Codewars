package com.codewars.twotoone;

import java.util.Arrays;

public class TwoToOne {
	public static String longest(String s1, String s2) {

		String somaStrings = s1 + s2;

		somaStrings = removeCharDuplicados(somaStrings);

		somaStrings = ordenaString(somaStrings);

		return somaStrings;

	}

	private static String ordenaString(String somaStrings) {
		char[] somaCharArray = somaStrings.toCharArray();
		Arrays.sort(somaCharArray);
		somaStrings = new String(somaCharArray);
		return somaStrings;
	}

	private static String removeCharDuplicados(String entradaString) {

		String saidaS = "";

		for (int i = 0; i < entradaString.length(); i++) {
			if (!saidaS.contains(Character.toString(entradaString.charAt(i)))) {
				saidaS = saidaS + Character.toString(entradaString.charAt(i));
			}
		}

		return saidaS;

	}

}
