package adventurecompanion.weapon;

import java.util.ArrayList;

public class RandomWeaponGenerator {

	ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
	
	final private Weapon magicStaff = new Weapon("Staff", "Priest, Wizard", "5", "A magical"
			+ " staff used by Wizards and Priests.", "Magic Staff");
	final private Weapon axe = new Weapon("Blade", "Warrior, Cook", "15", "A sharp axe that is useful for"
			+ " cleaving orcs AND crawdads.", "Axe");
	final private Weapon rollingPin = new Weapon("Staff", "Cook", "10", "A lucky rolling pin covered in"
			+ " cooking oil and various body parts.", "Rolling Pin");
	final private Weapon shortSword = new Weapon("Blade", "Warrior, Knight", "10", "A generic short blade"
			+ " mades of iron.", "Short Sword");
	final private Weapon longSword = new Weapon("Blade", "Knight", "15", "A powerful blade wielded by the"
			+ " knights of the local lord", "Long Sword");
	final private Weapon shortBow = new Weapon("Bow", "Ranger", "10", "A quick and light bow useful for"
			+ " close encounters", "Short Bow");
	final private Weapon longBow = new Weapon("Bow", "Ranger", "15", "A large bow that is unwieldy to use"
			+ " in close quarters", "Long Bow");
	
	public RandomWeaponGenerator() {
		weaponList.add(magicStaff);
		weaponList.add(axe);
		weaponList.add(rollingPin);
		weaponList.add(shortSword);
		weaponList.add(longSword);
		weaponList.add(shortBow);
		weaponList.add(longBow);
	}
	public Weapon createRandomWeapon() {
		int randomVal = (int)(Math.random()*6);
		Weapon randomWeapon = weaponList.get(randomVal);
		return randomWeapon;
	}
	
}
