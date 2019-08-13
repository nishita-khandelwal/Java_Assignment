package com.zensar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
class AddTest {
	@Test
	void test() {
		//fail("Not yet implemented");
		Calculator calculator=new Calculator();
		int result=calculator.add(15, 75);
		assertEquals(result, 90);
	}

}
