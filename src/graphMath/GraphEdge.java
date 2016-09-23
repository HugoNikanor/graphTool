package graphMath;

public class GraphEdge {
	private String name;
	private GraphNode[] endpoints;
	
	public GraphEdge(){
		endpoints = new GraphNode[2];
	}
	
	public GraphEdge(GraphNode a,GraphNode b){
		endpoints = new GraphNode[2];
		
		connectNodes(a,b);
	}
	
	public String getName(){
		return this.getName();
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public void connectNodes(GraphNode a,GraphNode b){
		this.endpoints[0] = a;
		this.endpoints[1] = b;
		a.addConnection(this);
		b.addConnection(this);
	}
}