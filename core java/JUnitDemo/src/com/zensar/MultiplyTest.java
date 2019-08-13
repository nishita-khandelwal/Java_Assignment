package com.zensar;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MultiplyTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Calculator calculator=new Calculator();
		int result=calculator.multiply(35, 75);
		assertEquals(result, 90);
	}

}
