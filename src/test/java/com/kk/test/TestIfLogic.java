package com.kk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.kk.IfLogic;

class TestIfLogic {

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5, 63, 40, 15})
	void testIfWeird(int n) {
		IfLogic ifl = new IfLogic();
		String actual = ifl.checkWeird(n);
		System.out.println(actual);
		assertEquals("Weird", actual);
		
		
	}

}
