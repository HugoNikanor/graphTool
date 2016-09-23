package graphCanvas;

import java.util.HashMap;

public class CanvasAccess {
	private static HashMap<Integer, GraphToolCanvas> canvases;

	public static void AddCanvas(GraphToolCanvas canvas) {
		CanvasAccess.GetCanvases().put(new Integer(canvas.hashCode()), canvas);
	}

	public static GraphToolCanvas RequestActiveCanvas() {
		System.out.println("Getting Canvas:");
		for(Integer key : canvases.keySet()) {
			System.out.println(key);
			GraphToolCanvas c = canvases.get(key);
			//if(c.isVisible()) {
				return c;
			//}
		}
		throw new NoCanvasException();
	}

	private static HashMap<Integer, GraphToolCanvas> GetCanvases() {
		if (canvases == null) {
			canvases = new HashMap<Integer, GraphToolCanvas>();
		}
		return canvases;
	}
}
