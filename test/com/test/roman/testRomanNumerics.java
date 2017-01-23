package com.test.roman;

import static org.junit.Assert.*;
import com.roman.*;

import org.junit.Before;
import org.junit.Test;

public class testRomanNumerics {
	RomanNumerics rom;
	
	@Before
	public void setUp() throws Exception {
		 rom = new RomanNumerics();
	}

	@Test
	public void testRomanSingleDigit() {
		 int output = rom.convert("VIII");
		 assertEquals(8,output);
	}

	@Test
	public void testRomanDoubleDigit() {
		int output = rom.convert("CLVIII");
		assertEquals(158,output);
	}

	@Test
	public void testRomanTribbleDigit() {
		int output = rom.convert("LVIII");
		assertEquals(58,output);
	}

	@Test
	public void testRomanToTestMinusDigit() {
		int output = rom.convert("LXXVIII");
		assertEquals(78,output);
	}

}
