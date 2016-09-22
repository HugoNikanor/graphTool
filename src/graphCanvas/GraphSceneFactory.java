package graphCanvas;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class GraphSceneFactory {

	public static GraphScene makeGraphScene() {
		Parent root = new StackPane();
		GraphScene scene = new GraphScene(root);

		return scene;
	}
}
