package com.zensar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class SubtractTest {
	@Test
	void test() {
		//fail("Not yet implemented");
		Calculator calculator=new Calculator();
		int result=calculator.subtract(75, 35);
		assertEquals(result, 40);
	}

}
