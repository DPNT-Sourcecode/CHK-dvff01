package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class HelloSolutionTest {
	
	
	@Test
    public void helloSolutionStringTest() {
		HelloSolution helloSolution = new HelloSolution();
		String name="Hello World";
        assertThat(helloSolution.hello(name), equalTo("Hello World"));
    }
	

}

