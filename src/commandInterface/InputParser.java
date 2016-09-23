package commandInterface;

public class InputParser {
	public static String parse(String input) {
		// TODO character casing
		String[] args = input.split(" ");

		String output = "";

		switch(args[0]) {
			case "node":
				output += "So you wan't a node?";
				break;
			default:
				output += "Unkwon command";
				break;
		}
		return output;
	}
}
