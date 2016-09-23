package graphCanvas;

import java.io.File;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class GraphSceneFactory {

	public static GraphScene makeGraphScene() {
		Parent root = new StackPane();
		GraphScene scene = new GraphScene(root);

		File styleFile = new File("resources/stylesheets/canvas.css");
		String styleFilePath
			= "file:///" + styleFile.getAbsolutePath().replace("\\", "/");
		scene.getStylesheets().add(styleFilePath);

		return scene;
	}
}
