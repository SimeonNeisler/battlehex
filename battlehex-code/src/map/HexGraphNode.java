package map;

import java.util.ArrayList;

import com.sun.javafx.geom.Edge;

public class HexGraphNode {
	
	int Node;
	ArrayList<HexGraphNode> EdgeList = new ArrayList<HexGraphNode>(6);
	
	public HexGraphNode(int Vertex) {
		Node = Vertex;
	}

	
	public void addEdge(int index, HexGraphNode V2){
		EdgeList.add(index, V2);
	}
	
	public HexGraphNode getEdge(int index){
		HexGraphNode returnNode = EdgeList.get(index);
		return returnNode;
	}
	public String toString(){
		String nodeString = new String("Node " + Node);
		return nodeString;
	}
}
