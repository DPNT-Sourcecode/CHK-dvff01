package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HelloSolutionTest2 {

	@Test
	public void helloSolutionMessageTest() {
		HelloSolution2 helloSolution2 = new HelloSolution2();
		Assert.assertEquals("Hello, John!", helloSolution2.hello("John"));
		Assert.assertEquals("Hello, Emma!", helloSolution2.hello("Emma"));
	}

}

