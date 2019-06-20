package befaster.solutions.HLO;

import org.junit.Assert;
import org.junit.Test;

public class HelloSolutionTest {
	
	
	@Test
    public void helloSolutionStringTest() {
		HelloSolution helloSolution = new HelloSolution();
		String name="Hello, World!";
		Assert.assertEquals(name, helloSolution.hello(name));
		Assert.assertEquals("Hello, World!", helloSolution.hello("Craftsman"));
		Assert.assertEquals("Hello, World!", helloSolution.hello("Mr. X"));
    }
	

}

