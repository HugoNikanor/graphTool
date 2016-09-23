package commandInterface;

import graphCanvas.CanvasInterface;

/**
 * TODO maybe allow this to take a dispatcher
 */
public class MessageDispatcher {

	CanvasInterface dispatcher;

	public MessageDispatcher() {
		dispatcher = new CanvasInterface();
	}

	public String dispatch(String message) {
		return dispatcher.handleCommand(message);
	}
}
