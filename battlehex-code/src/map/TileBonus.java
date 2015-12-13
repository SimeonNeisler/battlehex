package map;

public class TileBonus {
	String structureName;
	int resourceBonus;
	int combatHPBonus;
	int combatStrBonus;
	public TileBonus (String structureName, int resourceBonus, int combatHPBonus, int combatStrBonus) {
		this.structureName = structureName;
		this.resourceBonus = resourceBonus;
		this.combatHPBonus = combatHPBonus;
		this.combatStrBonus = combatStrBonus;
	}

}
