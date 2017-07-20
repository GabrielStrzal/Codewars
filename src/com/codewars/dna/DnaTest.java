package com.codewars.dna;

import static org.junit.Assert.*;

import org.junit.Test;

public class DnaTest {

	@Test
    public void replaceAtoTTest() {
       assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void replaceGandCTest() {
       assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void replaceTandATest() {
       assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }   
}
