package abstractGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Node> nodes;

	private int nodeLocationCounter = 0;

	public Graph() {
		nodes = new ArrayList<Node>();
	}

	public void addNode() {
		nodes.add(new Node(nodeLocationCounter += 20, nodeLocationCounter));
	}

	public void addVertex() {
	}

	/**
	 * @return the nodes
	 */
	public List<Node> getNodes() {
		return nodes;
	}
}
