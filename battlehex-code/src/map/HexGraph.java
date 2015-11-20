package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HexGraph<E> {
	ArrayList<E> elementList = new ArrayList<E>();
	//Map<E, HashMap<HexSides, E>> elementEdgesMap = new HashMap<E, HashMap<HexSides, E>>();
	Map<HexCordinates, E> cordinatesMap = new HashMap<HexCordinates, E>();
	//ArrayList<HexSides> sidesList = new ArrayList<HexSides>();
	int cordinatesMapCheck = 0;
		
	public HexGraph() {
		
	}
	
	public void add(E element, HexCordinates elementCordinates) {
		HashMap<HexSides, E> edgeMap = new HashMap<HexSides, E>();
		elementList.add(element);
		cordinatesMap.put(elementCordinates, element);
	}		
	
	public void addAll(Collection<E> collection) {
		ArrayList collectionConvert = new ArrayList(collection);
		for (int x = 0; x<collectionConvert.size(); x++) {
		}
	}
	
	/**public boolean addEdge(E element1, HexSides side1, E element2, HexSides side2) {
		HashMap<HexSides, E> edgeMap1 = elementEdgesMap.get(element1);
		HashMap<HexSides, E> edgeMap2 = elementEdgesMap.get(element2);
		if (edgeMap1.get(side1) != null){
			return false;
		}
		else if (edgeMap2.get(side2) != null){
			return false;
		}
		edgeMap1.put(side1, element2);
		edgeMap2.put(side2, element1);
		return true;
	}**/
	
	/**public void gridMapping(E element) {
		int x = 0;
		if (cordinatesMap.isEmpty()) {
			HexCordinates origin = new HexCordinates(0, 0);
			cordinatesMap.put(element, origin);
			gridMapping(element);
			cordinatesMapCheck++;
		}
		else {
			E parentElement = element;
			HexCordinates parentCordinates = cordinatesMap.get(parentElement);
			HexCordinates newCordinates1 =  new HexCordinates(parentCordinates.getX() + 0, parentCordinates.getY() + 2);
			HexCordinates newCordinates2 =  new HexCordinates(parentCordinates.getX() + 1, parentCordinates.getY() + 1);
			HexCordinates newCordinates3 =  new HexCordinates(parentCordinates.getX() + 1, parentCordinates.getY() - 1);
			HexCordinates newCordinates4 =  new HexCordinates(parentCordinates.getX() + 0, parentCordinates.getY() - 2);
			HexCordinates newCordinates5 =  new HexCordinates(parentCordinates.getX() - 1, parentCordinates.getY() - 1);
			HexCordinates newCordinates6 =  new HexCordinates(parentCordinates.getX() - 1, parentCordinates.getY() + 1);
			E newElement1 = getEdge(parentElement, HexSides.SIDE0);
			E newElement2 = getEdge(parentElement, HexSides.SIDE1);
			E newElement3 = getEdge(parentElement, HexSides.SIDE2);
			E newElement4 = getEdge(parentElement, HexSides.SIDE3);
			E newElement5 = getEdge(parentElement, HexSides.SIDE4);
			E newElement6 = getEdge(parentElement, HexSides.SIDE5);
			if (cordinatesMap.containsKey(newElement1) | newElement1 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement1, newCordinates1);
				gridMapping(newElement1);
			}
			if (cordinatesMap.containsKey(newElement2) | newElement2 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement2, newCordinates2);
				gridMapping(newElement2);
			}
			if (cordinatesMap.containsKey(newElement3) | newElement3 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement3, newCordinates3);
				gridMapping(newElement3);
			}
			if (cordinatesMap.containsKey(newElement4) | newElement4 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement4, newCordinates4);
				gridMapping(newElement4);
			}
			if (cordinatesMap.containsKey(newElement5) | newElement5 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement5, newCordinates5);
				gridMapping(newElement5);
			}
			if (cordinatesMap.containsKey(newElement6) | newElement6 == null) {
				x++;
			}
			else {
				cordinatesMap.put(newElement6, newCordinates6);
				gridMapping(newElement6);
			}
			if (cordinatesMap.size() == elementList.size()) {
				autoEdge();
			}
		}
		
	}**/
	
	/**public void autoEdge() {
		for (int x = 0; x<elementList.size(); x++) {
			E baseTile = elementList.get(x);
			HexCordinates baseTileCordinates = cordinatesMap.get(baseTile);
			for (int y = 0; y<elementList.size(); y++) {
				E otherTile = elementList.get(y);
				HexCordinates otherTileCordinates = cordinatesMap.get(otherTile);
				if (otherTileCordinates.getX() == baseTileCordinates.getX() & otherTileCordinates.getY() == baseTileCordinates.getY() + 2) {
					addEdge(baseTile, HexSides.SIDE0, otherTile, HexSides.SIDE3);
				}
				if (otherTileCordinates.getX() == baseTileCordinates.getX() + 1 & otherTileCordinates.getY() == baseTileCordinates.getY() + 1) {
					addEdge(baseTile, HexSides.SIDE1, otherTile, HexSides.SIDE4);
				}
				if (otherTileCordinates.getX() == baseTileCordinates.getX() + 1 & otherTileCordinates.getY() == baseTileCordinates.getY() -1) {
					addEdge(baseTile, HexSides.SIDE2, otherTile, HexSides.SIDE5);
				}
				if (otherTileCordinates.getX() == baseTileCordinates.getX() & otherTileCordinates.getY() == baseTileCordinates.getY() - 2) {
					addEdge(baseTile, HexSides.SIDE3, otherTile, HexSides.SIDE0);
				}
				if (otherTileCordinates.getX() == baseTileCordinates.getX() - 1 & otherTileCordinates.getY() == baseTileCordinates.getY() - 1) {
					addEdge(baseTile, HexSides.SIDE4, otherTile, HexSides.SIDE1);
				}
				if (otherTileCordinates.getX() == baseTileCordinates.getX() - 1 & otherTileCordinates.getY() == baseTileCordinates.getY() + 1) {
					addEdge(baseTile, HexSides.SIDE5, otherTile, HexSides.SIDE2);
				}
				
			}
		}
	}**/
	
	public Map displayCordinates() {
		System.out.print(cordinatesMap);
		return cordinatesMap;
	}
	
	public E getNode(int x, int y) {
		ArrayList<HexCordinates> cordinatesList = new ArrayList<HexCordinates>();
		cordinatesList.addAll(cordinatesMap.keySet());
		HexCordinates nodeCordinates = null;
		for (x = 0; x < cordinatesList.size(); x++) {
			nodeCordinates = cordinatesList.get(x);
			if (nodeCordinates.getX() == x & nodeCordinates.getY() == y) {
				break;
			}
		}
		System.out.println(cordinatesMap.get(nodeCordinates));
		return(cordinatesMap.get(nodeCordinates));
	}
	
	public HexCordinates getElementCordinates(E element) {
		ArrayList<HexCordinates> cordinatesList = new ArrayList<HexCordinates>();
		cordinatesList.addAll(cordinatesMap.keySet());
		HexCordinates nodeCordinates = null;
		for (int x = 0; x <cordinatesList.size(); x++) {
			nodeCordinates = cordinatesList.get(x);
			E mapElem = cordinatesMap.get(nodeCordinates);
			if (mapElem == element) {
				break;
			}
		}
		System.out.println(nodeCordinates);
		return nodeCordinates;
		
	}
	
	public boolean remove(Object object) {
		int x = elementList.indexOf(object);
		if (x == -1) {
			return false;
		}
		else {
			elementList.remove(x);
			ArrayList<HexCordinates> cordinatesList = new ArrayList<HexCordinates>();
			cordinatesList.addAll(cordinatesMap.keySet());
			for (int index = 0; index <cordinatesList.size(); index++) {
				HexCordinates cordinates = cordinatesList.get(x);
				E element1 = cordinatesMap.get(cordinates);
				if (element1 == object) {
					cordinatesMap.remove(cordinatesList, element1);
				}
			}
			return true;
		}
		
	}
	
	public boolean removeAll(Collection<?> collection) {
		ArrayList collectionConvert = new ArrayList(collection);
		Object collectionObject = null;
		for (int x = 0; x<collectionConvert.size(); x++) {
			if (elementList.contains(collectionConvert.get(x))){
				collectionObject = collectionConvert.get(x);
				remove(collectionObject);
			}
		}
		if (collectionObject == null) {
			return false;
		}
		else {
			return true;
		}
	}
			
	
	/**public void getAll () {
		for (int x = 0; x<elementList.size(); x++) {
			System.out.println(elementList.get(x));
		}
	}
	
	public E getEdge(E element, HexSides side) {
		HashMap edgeMap = elementEdgesMap.get(element);
		E element2 = (E) edgeMap.get(side);
		return element2;
	}
	
	public HexSides findEdge(E element1, E element2) {
		Map<HexSides, E> edgeMap = getAllEdges(element1);
		ArrayList<HexSides> neighborList = Collections.list(Collections.enumeration(edgeMap.keySet()) );
		int x = 0;
		E searchElem = edgeMap.get(neighborList.get(x));;
		while (element2 != searchElem) {
			x++;
			searchElem = edgeMap.get(neighborList.get(x));
		}
		return neighborList.get(x);
	}
	
	public Map<HexSides, E> getAllEdges(E element) {
		HashMap edgeMap = elementEdgesMap.get(element);
		System.out.println(edgeMap);
		return (Map<HexSides, E>) edgeMap.clone();
	}**/
}
