package graphCanvas;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class GraphScene extends Scene {

	public GraphScene(Parent root) {
		super(root);

		Pane rootPane = (Pane) root;

		rootPane.getStyleClass().add("my-root");

		System.out.println(rootPane.getStyleClass());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(new GraphToolCanvas());

		rootPane
			.getChildren()
			.add(borderPane);
	}

}
