package graphScene;

import graphCanvas.GraphExporterAccess;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class GraphScene extends Scene {

	protected GraphScene(Parent root) {
		super(root);

		Pane rootPane = (Pane) root;

		rootPane.getStyleClass().add("my-root");

		System.out.println(rootPane.getStyleClass());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter((Canvas) GraphExporterAccess.request("fx"));

		rootPane
			.getChildren()
			.add(borderPane);
	}
}
