package befaster.solutions.HLO;

public class HelloSolution2 {

	// String hello(string name)---> Message with name
	// two ways one is concatenate the strings and other user String builder

	public String hello(String name) {
		StringBuilder str = new StringBuilder();
		String greetingMessage = "Hello";
		StringBuilder messageInString = str.append(greetingMessage).append(",").append(" ").append(name).append("!");
		String actualMessageInString = messageInString.toString();

		return actualMessageInString;

	}

}


