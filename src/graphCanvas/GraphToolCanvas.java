package graphCanvas;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class GraphToolCanvas extends Canvas {
	
	GraphicsContext gc;
	
	public GraphToolCanvas() {
		super(500, 500);
		
		gc = this.getGraphicsContext2D();
		
		this.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				double x = e.getX();
				double y = e.getY();
				
				System.out.println(e);
				
				//gc.fillOval(x -10, y - 10, 20, 20);
				placeNode((int) x, (int) y);
			}
		});
		
	}

	public void placeNode(int x, int y) {
		System.out.println(this.hashCode());
		System.out.format("Placing node at (%d, %d)%n", x, y);
		gc.fillOval(x - 10, y - 10, 20, 20);
	}

	public GraphicsContext getContext() {
		return this.getGraphicsContext2D();
	}
}
