package adventurecompanion.dice;

public class SixSideDice extends Dice {

	public SixSideDice() { roll(); }
	
	public void roll() {setCurrentFace((int)(Math.random()*6)+1);}

}
