package adventurecompanion.character;

import java.util.ArrayList;

// This class will return a random character from a list of 14 prefabricated template 
// characters. 

public class RandomCharacterBuilder {

	ArrayList<Character> prefabChars = new ArrayList<Character>();
	StatBuilder sb = new StatBuilder();

	private final Character maleWarrior = new Character("Frank", "Warrior",
			"Male", sb.getWarrior());
	private final Character femaleWarrior = new Character("Helga", "Warrior",
			"Female", sb.getWarrior());
	private final Character maleRanger = new Character("Liolen", "Ranger",
			"Male", sb.getRanger());
	private final Character femaleRanger = new Character("Liola", "Ranger",
			"Female", sb.getRanger());
	private final Character malePriest = new Character("Jeff", "Priest",
			"Male", sb.getPriest());
	private final Character femalePriest = new Character("Cindy", "Priest",
			"Female", sb.getPriest());
	private final Character maleKnight = new Character("Leonard", "Knight",
			"Male", sb.getKnight());
	private final Character femaleKnight = new Character("Breanna", "Knight",
			"Female", sb.getKnight());
	private final Character maleWizard = new Character("Mandolf", "Wizard",
			"Male", sb.getWizard());
	private final Character femaleWizard = new Character("Jenna", "Wizard",
			"Female", sb.getWizard());
	private final Character maleMonk = new Character("Bean", "Monk", "Male",
			sb.getMonk());
	private final Character femaleMonk = new Character("Jian", "Monk",
			"Female", sb.getMonk());
	private final Character maleCook = new Character("Gordon", "Cook", "Male",
			sb.getCook());
	private final Character femaleCook = new Character("Helia", "Cook",
			"Female", sb.getCook());

	public RandomCharacterBuilder() {
		prefabChars.add(maleWarrior);
		prefabChars.add(femaleWarrior);
		prefabChars.add(maleRanger);
		prefabChars.add(femaleRanger);
		prefabChars.add(malePriest);
		prefabChars.add(femalePriest);
		prefabChars.add(maleKnight);
		prefabChars.add(femaleKnight);
		prefabChars.add(maleWizard);
		prefabChars.add(femaleWizard);
		prefabChars.add(maleMonk);
		prefabChars.add(femaleMonk);
		prefabChars.add(maleCook);
		prefabChars.add(femaleCook);
	}

	public Character getRandomCharacter() {
		int randomVal = (int) (Math.random() * 13);
		Character randomChar = prefabChars.get(randomVal);
		return randomChar;
	}

}
