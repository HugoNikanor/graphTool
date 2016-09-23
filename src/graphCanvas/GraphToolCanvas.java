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

		System.out.format("%e, %e%n", this.getWidth(), this.getHeight());
		
		this.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				double x = e.getSceneX();
				double y = e.getSceneY();
				
				System.out.println(e);
				
				gc.fillOval(x -10, y - 10, 20, 20);
			}
		});
		
	}
	
	
	

}
