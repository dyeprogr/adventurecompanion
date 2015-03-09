package adventurecompanion.weapon;

import java.awt.Image;

public class Weapon {
	
	private String weaponType;
	private String equipableBy;
	private String damage;
	private Image image;
	private String description;
	private String name;
	
	public Weapon(String weaponType, String equipableBy, String damage, String description,
			String name) {
		
		this.weaponType = weaponType;
		this.equipableBy = equipableBy;
		this.damage = damage;
		//this.image = image;
		this.description = description;
		this.name = name;
		
	}
	
	public String getWeaponType() {return weaponType;}
	public String getEquipableBy() {return equipableBy;}
	public String getDamage() {return damage;}
	public Image getImage() {return image;}
	public String getDescription() {return description;}
	public String getName() {return name;}
	
	

}
