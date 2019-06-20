package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class HelloSolutionTest {
	
	
	@Test
    public void helloSolutionStringTest() {
		HelloSolution helloSolution = new HelloSolution();
		String name="Craftsman";
		String name2="Mr. X";
        assertThat(helloSolution.hello(name), equalTo("Craftsman"));
        assertThat(helloSolution.hello(name2), equalTo("Mr. X"));

    }
	

}
