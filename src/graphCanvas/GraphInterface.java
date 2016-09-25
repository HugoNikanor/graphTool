package graphCanvas;

import abstractGraph.Graph;

import commandInterface.MessageHandler;

/**
 * Class for translating strings into commands for adding objects to a graph
 */
public class GraphInterface implements MessageHandler {

	private Graph graph;

	public GraphInterface(Graph graph) {
		System.out.println("Created canvas interface");
		this.graph = graph;
	}

	@Override
	public String dispatch(String command) {
		System.out.println(command);
		return translateCommand(command.split(" "));
	}

	/**
	 * TODO this maybe should return response objects over strings
	 */
	private String translateCommand(String[] command) {
		try {
			switch(command[0]) {
				case "node": // Place a node
					// Note that it's not up to the user where the node should be placed,
					// But rather that there should be a node
					// TODO allow for named nodes
					// TODO return information about the node,
					//      instead of a rather worthless string
					graph.addNode();
					return "=> Placed";
				case "export": // 
					// TODO this should have the ability to take extra arguments
					//      such as filename and simmilar
					GraphExporterAccess.request(command[1]).exportHere(graph);
					return "=> exported";
				default:
					return "=> Unknown command";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "=> bad indata";
		}
	}
}
