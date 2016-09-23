package graphCanvas;

/**
 * Interface for accessing arbitrarily chosen JavaFX canvases through text
 *
 * Currently handles the string to graphic interfacing
 *
 * TODO possibly create an dispatcher interface, which this will implement
 */
public class CanvasInterface {

	GraphToolCanvas canvas;

	public CanvasInterface() {
		System.out.println("Created canvas interface");
		canvas = CanvasAccess.RequestActiveCanvas();
	}

	public String handleCommand(String command) {
		return translateCommand(command.split(" "));
	}

	/**
	 * TODO this maybe should return response objects over strings
	 */
	private String translateCommand(String[] command) {
		switch(command[0]) {
			case "node":
				canvas.placeNode(
						Integer.parseInt(command[1]),
						Integer.parseInt(command[2]));
				return "Placed";
			default:
				return "Unknown command";
		}
	}
}
