package map;

public class HexGraphTest {
	public static void main (String[] args) throws Exception{
		
		HexGraph<HexGraphNode> myHexGraph = new HexGraph<HexGraphNode>();
		HexGraphNode nodeOne = new HexGraphNode(1);
		HexGraphNode nodeTwo = new HexGraphNode(2);
		HexGraphNode nodeThree = new HexGraphNode(3);
		HexGraphNode nodeFour = new HexGraphNode(4);
		HexGraphNode nodeFive = new HexGraphNode(5);
		HexGraphNode nodeSix = new HexGraphNode(6);
		HexGraphNode nodeSeven = new HexGraphNode(7);
		HexCordinates nodeOneCord = new HexCordinates (0, 0);
		myHexGraph.add(nodeOne, nodeOneCord);
		myHexGraph.getNode(0, 0);
		myHexGraph.getElementCordinates(nodeOne);
	}

}
