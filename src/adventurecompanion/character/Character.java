package adventurecompanion.character;

import java.util.HashMap;

public class Character {

	private final String name;
	private final String className;
	private final String gender;
	private final HashMap<String,Integer> stats;
	//private final Image image
	
	public Character(String name, String className, String gender,
			HashMap<String,Integer> stats) { 
		
		this.name = name;
		this.className = className;
		this.gender = gender;
		this.stats = stats;
		
	}
	
	public String getName() { return name; }
	public String getClassName() {return className; }
	public String getGender() {return gender; }
	public int getStat(String stat) { return stats.get(stat);
	}
	
	
}








