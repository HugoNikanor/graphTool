package graphCanvas;

public class NoCanvasException extends RuntimeException {
	private static final long serialVersionUID = 47844464613737584L;

	public NoCanvasException() {
		super("No Canvas Found");
	}

	public NoCanvasException(String msg) {
		super(msg);
	}

}
