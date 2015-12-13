package map;

import unitClass.BoardUnit;

public class HexTile {
	int nodeNum;
	int resourceCount;
	BoardUnit Unit;
	TileTerrain terrain;
	TileFeature feature;
	
	public HexTile(int nodeNum, int resourceCount, BoardUnit Unit, TileTerrain terrain, TileFeature feature, TileBonus bonus) {
		this.nodeNum = nodeNum;
		this.resourceCount = resourceCount;
		this.Unit = Unit;
		this.terrain = terrain;
		this.feature = feature;
	}
	
	public BoardUnit getUnit() {
		return Unit;
	}
	
	public void setUnit (BoardUnit newUnit) {
		Unit = newUnit;
	}
	
	public TileTerrain getTerrain() {
		return terrain;
	}
	
	public void setTerrain(TileTerrain newTerrain) {
		terrain = newTerrain;
	}
	
	public int getResourceCount() {
		return resourceCount;
	}
	
	public void setResourceCount (int newResourceCount) {
		resourceCount = newResourceCount;
	}
	
	public TileFeature getFeature() {
		return feature;
	}
	
	public void setFeature(TileFeature newFeature) {
		feature = newFeature;
	}

}
