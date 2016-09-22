package graphCanvas;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GraphScene extends Scene {

	public GraphScene(Parent root) {
		super(root);

		((Pane) root)
			.getChildren()
			.add(new GraphToolCanvas());
	}

}
