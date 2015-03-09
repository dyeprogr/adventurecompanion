package adventurecompanion.dice;

public class DiceTest {
	public static void main(String[] args) {

		DiceManager dm = DiceManager.getInstance();
		
		System.out.println(dm.getSum());
		dm.rollAll();
		System.out.println(dm.getSum());
		dm.rollAll();
		System.out.println(dm.getSum());
		dm.rollAll();
		System.out.println(dm.getSum());
		dm.rollAll();
		
		
	}
}
