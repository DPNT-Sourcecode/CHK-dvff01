package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {

	public String hello(String friendName) {
		return friendName;
	}

	public static void main(String args[]) {

		String name = "Hello World";

		HelloSolution helloSolution = new HelloSolution();
		System.out.println(helloSolution.hello(name));

	}
}
