package graphScene;

import java.io.File;

import commandInterface.MessageHandler;
import graphCanvas.GraphExporterAccess;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class GraphSceneFactory {

	public static GraphScene makeGraphScene(MessageHandler handler) {
		Parent root = new StackPane();

		FxCanvas canvas = new FxCanvas(handler);
		GraphExporterAccess.addExporter(canvas);

		GraphScene scene = new GraphScene(root);

		File styleFile = new File("resources/stylesheets/canvas.css");
		String styleFilePath
			= "file:///" + styleFile.getAbsolutePath().replace("\\", "/");
		scene.getStylesheets().add(styleFilePath);

		return scene;
	}
}
