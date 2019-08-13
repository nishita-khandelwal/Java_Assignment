package com.zensar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
class DivideTest {
	@Test
	void test() {
		//fail("Not yet implemented");
		Calculator calculator=new Calculator();
		int result=(int) calculator.divide(6, 3);
		assertEquals(result, 2);
	}

}
