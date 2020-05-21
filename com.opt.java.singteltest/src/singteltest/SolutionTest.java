package singteltest;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	
	//Since the methods are returning string test whether they output the correct string
	//Also good to test that they return the message or any message
	Bird refD = new Duck();

	@Test
	public void testNotNull() {
		Assert.assertNotNull(refD);
	}
	@Test
	public void testOuput() {
		Assert.assertEquals("Quack Quack",refD.sing());
	}

}
