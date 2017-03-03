package com.codewars.mumbling;

public class Accumul {
	 public static String accum(String s) {
		 
		 String receiverdString = s.toLowerCase();
		 String result = "";
		 
		 for(int i =0; i<receiverdString.length(); i++){
			char letra = receiverdString.charAt(i);
			String letraString = Character.toString(letra);
			result = result + letraString.toUpperCase();
			for (int j = 0; j < i; j++){
				result = result + letraString;
			}
			if(i != receiverdString.length()-1) {
			result = result + "-";
			}
		 }
		 return result;
	 }
}
