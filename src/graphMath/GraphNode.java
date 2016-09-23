package graphMath;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	private List<GraphEdge> connections;
	private String name;
	
	public GraphNode(){
		this.connections = new ArrayList();
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String n){
		this.name = n;
	}
	
	public void addConnection(GraphEdge e){
		connections.add(e);
	}
	
	public void removeConnection(GraphEdge g){
		connections.remove(g);
	}
	
	public List<GraphEdge> getConnections(){
		return this.connections;
	}
}
