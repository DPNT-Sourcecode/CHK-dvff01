package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {

	public String hello(String friendName) {
		if(friendName == "Craftsman")||(friendName="Mr. X"){
			friendName = "Hello, World";
		}
		return friendName;
	}

	public static void main(String args[]) {

		String message = "Hello, World!";

		HelloSolution helloSolution = new HelloSolution();
		helloSolution.hello(message);

	}
}

