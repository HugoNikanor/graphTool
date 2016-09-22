package graphCanvas;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class GraphToolCanvas extends Canvas {
	
	GraphicsContext gc;
	
	public GraphToolCanvas(int width,int height){
		//this.setWidth(width);
		//this.setHeight(height);
		
		gc = this.getGraphicsContext2D();
		
		this.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				double x = e.getSceneX();
				double y = e.getSceneY();
				
				
				gc.fillOval(x -10, y - 10, 20, 20);
			}
		});
		
	}
	
	
	

}
