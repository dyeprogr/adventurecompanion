package adventurecompanion.character;

public class RandomCharTest {

	public static void main(String[] args) {
		RandomCharacterBuilder rcb = new RandomCharacterBuilder();
		Character player = rcb.getRandomCharacter();

		System.out.println("Name : " + player.getName());
		System.out.println("Class : " + player.getClassName());
		System.out.println("Gender : " + player.getGender());
		System.out.println("HP : " + player.getStat("HP"));
		System.out.println("Str : " + player.getStat("Str"));
		System.out.println("Int : " + player.getStat("Int"));
		System.out.println("Dex : " + player.getStat("Dex"));
	}
}
