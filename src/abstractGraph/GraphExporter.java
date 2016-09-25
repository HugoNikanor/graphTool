package abstractGraph;

/**
 * Interface for writing graph exporters
 *
 * These are classes which have the ability to take a graph,
 * and return it in some form of output format, which can be
 * output to the screen, to a file, or something else.
 *
 * @method getType should return the type of the exporter,
 * used when the user wants a specific output
 */
public interface GraphExporter {
	String getType();
	void exportHere(Graph graph);
}
