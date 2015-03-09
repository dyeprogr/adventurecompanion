package adventurecompanion.character;

import java.util.HashMap;

//This class generates attributes that are derived from a class selection

public class StatBuilder {
	
	private  HashMap<String,Integer> warriorStats = new HashMap<>();
	private  HashMap<String,Integer> rangerStats = new HashMap<>();
	private  HashMap<String,Integer> priestStats = new HashMap<>();
	private  HashMap<String,Integer> knightStats = new HashMap<>();
	private  HashMap<String,Integer> wizardStats = new HashMap<>();
	private  HashMap<String,Integer> monkStats = new HashMap<>();
	private  HashMap<String,Integer> cookStats = new HashMap<>();
	
	public StatBuilder() { 
		buildStats();
	}
	
	private void buildStats() {
		warriorStats.put("HP", 20);
		warriorStats.put("Str", 15);
		warriorStats.put("Int", 5);
		warriorStats.put("Dex", 8);
		
		rangerStats.put("HP", 15);
		rangerStats.put("Str", 5);
		rangerStats.put("Int", 5);
		rangerStats.put("Dex", 15);
		
		priestStats.put("HP", 10);
		priestStats.put("Str", 5);
		priestStats.put("Int", 18);
		priestStats.put("Dex", 5);
		
		knightStats.put("HP", 20);
		knightStats.put("Str", 15);
		knightStats.put("Int", 10);
		knightStats.put("Dex", 3);
		
		wizardStats.put("HP", 10);
		wizardStats.put("Str", 3);
		wizardStats.put("Int", 20);
		wizardStats.put("Dex", 5);
		
		monkStats.put("HP", 15);
		monkStats.put("Str", 5);
		monkStats.put("Int", 5);
		monkStats.put("Dex", 5);

		cookStats.put("HP", 25);
		cookStats.put("Str", 15);
		cookStats.put("Int", 5);
		cookStats.put("Dex", 3);
	}

	public HashMap<String, Integer> getWarrior() { return warriorStats; }
	public HashMap<String, Integer> getRanger() { return rangerStats; }
	public HashMap<String, Integer> getPriest() { return priestStats; }
	public HashMap<String, Integer> getKnight() { return knightStats; }
	public HashMap<String, Integer> getWizard() { return wizardStats; } 
	public HashMap<String, Integer> getMonk() { return monkStats; }
	public HashMap<String, Integer> getCook() { return cookStats; } 
}
