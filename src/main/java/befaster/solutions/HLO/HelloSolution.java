package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {

	public String hello(String friendName) {
		return friendName;
	}

	public static void main(String args[]) {

		String message = "Hello, World!";

		HelloSolution helloSolution = new HelloSolution();
		helloSolution.hello(message);

	}
}

