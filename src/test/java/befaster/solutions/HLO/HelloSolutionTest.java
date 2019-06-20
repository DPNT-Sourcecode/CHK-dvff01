package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class HelloSolutionTest {
	
	
	@Test
    public void helloSolutionStringTest() {
		HelloSolution helloSolution = new HelloSolution();
		String name="Hello, World!";
		Assert.assertEquals(name, helloSolution.hello(name));

    }
	

}
