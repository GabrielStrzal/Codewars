package com.codewars.dna;

public class DnaStrand {
 //Your code
	public static String makeComplement(String dna) {

		char dnaArray[] = dna.toCharArray();
		String dnaReturn = "";
    
		for(int i=0; i<dnaArray.length; i++ ){

			if(dnaArray[i]=='T'){
				dnaReturn = dnaReturn + "A";
			}else if(dnaArray[i]=='C'){
				dnaReturn = dnaReturn + "G";
			}else if(dnaArray[i]=='A'){
				dnaReturn = dnaReturn + "T";
			}else if(dnaArray[i]=='G'){
				dnaReturn = dnaReturn + "C";
			}
		}
			
			
	    return dnaReturn;
	  }
	}