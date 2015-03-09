package adventurecompanion.dice;

public abstract class Dice {

	private int currentFace;
	
	abstract void roll();
	
	protected void setCurrentFace(int rollValue) {currentFace = rollValue;}
	
	public int getCurrentFace() {return currentFace;}
}
