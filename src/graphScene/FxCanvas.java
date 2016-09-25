package graphScene;

import abstractGraph.Graph;
import abstractGraph.GraphExporter;
import abstractGraph.Node;

import commandInterface.MessageHandler;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class FxCanvas extends Canvas
                             implements GraphExporter {

	GraphicsContext gc;

	public FxCanvas(MessageHandler handler) {
		super(500, 500);

		gc = this.getGraphicsContext2D();

		/*
		this.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent e) {
				double x = e.getX();
				double y = e.getY();

				System.out.println(e);

				gc.fillOval(x -10, y - 10, 20, 20);
			}
		});
		*/
		this.setOnMouseClicked(e -> {
			switch(e.getButton()) {
				case PRIMARY:
					handler.dispatch("node");
					break;
				case SECONDARY:
					handler.dispatch("export fx");
					break;
				default:
			}
		});

	}

	@Override
	public void exportHere(Graph graph) {
		for(Node n : graph.getNodes()) {
			gc.fillOval(n.getX() - 5, n.getY() - 5, 10, 10);
		}
	}

	/**
	 * TODO possibly change the string to something fancy
	 * Like "_FX"
	 */
	@Override
	public final String getType() {
		return "fx";
	}
}
