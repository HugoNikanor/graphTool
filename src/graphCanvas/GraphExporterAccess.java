package graphCanvas;

import java.util.HashMap;

import abstractGraph.GraphExporter;

public class GraphExporterAccess {
	private static HashMap<Integer, GraphExporter> exporters;

	public static void addExporter(GraphExporter exporter) {
		GraphExporterAccess.getExporters().put(new Integer(exporter.hashCode()), exporter);
	}

	public static GraphExporter request(String type) {
		System.out.println("Getting Canvas:");
		HashMap<Integer, GraphExporter> exp = getExporters();
		for(Integer key : exp.keySet()) {
			GraphExporter ge = exp.get(key);
			if(ge.getType().equals(type)) {
				return ge;
			}
		}
		throw new NoCanvasException();
	}

	private static HashMap<Integer, GraphExporter> getExporters() {
		if (exporters == null) {
			exporters = new HashMap<Integer, GraphExporter>();
		}
		return exporters;
	}
}
