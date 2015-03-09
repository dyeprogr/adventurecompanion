package adventurecompanion.dice;

public class DiceManager {
	
	//Setting up DiceManager as a singleton
	private static DiceManager instance = null;
	
	protected DiceManager() {
		sumDice();
	}
	
	public static DiceManager getInstance() {
	      if(instance == null) {
	         instance = new DiceManager();
	      }
	      return instance;
	     }
	
	//Implementation
	
	private int currentSum;
	Dice die1 = new SixSideDice();
	Dice die2 = new SixSideDice();
	Dice die3 = new SixSideDice();
	
	public void sumDice() {
		currentSum = die1.getCurrentFace() + die2.getCurrentFace() 
				+ die3.getCurrentFace();	
	}
	
	public void rollDie(int i) {
		if (i==1) {
			die1.roll();
			sumDice();
		}
		if (i==2) {
			die2.roll();
			sumDice();
		}
		else {
			die3.roll();
			sumDice();
		}
	}

	public Integer getFace(int i) {
		if (i==1) { return die1.getCurrentFace();
		}
		if (i==2) { return die2.getCurrentFace();
		}
		else { return die3.getCurrentFace(); }
	}
	public String getSum() { return String.valueOf(currentSum); }
	
	public void rollAll() {
		die1.roll();
		die2.roll();
		die3.roll();
		sumDice();
	}
}
