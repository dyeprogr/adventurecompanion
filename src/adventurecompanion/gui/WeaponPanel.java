package adventurecompanion.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adventurecompanion.weapon.RandomWeaponGenerator;
import adventurecompanion.weapon.Weapon;

public class WeaponPanel extends JPanel {
	
	final RandomWeaponGenerator rwg = new RandomWeaponGenerator();
	final Weapon weapon = rwg.createRandomWeapon();
	
	final JLabel nameLabel = new JLabel("Name: " + weapon.getName());
	final JLabel typeLabel = new JLabel("Weapon Type: " +weapon.getWeaponType());
	final JLabel descriptionLabel = new JLabel("Description: " +weapon.getDescription());
	final JLabel equipableLabel = new JLabel("Equipable by: " +weapon.getEquipableBy());
	final JLabel damageLabel = new JLabel("Damage: " + weapon.getDamage());
	final JButton randomButton = new JButton("Create Random Weapon");
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	// Trashes the old weapon and pull a new prefabricated weapon up
	ActionListener rbListen = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			Weapon weapon = rwg.createRandomWeapon();
			nameLabel.setText("Name: " + weapon.getName());
			typeLabel.setText("Weapon Type: " +weapon.getWeaponType());
			descriptionLabel.setText("Description: " + weapon.getDescription());
			equipableLabel.setText("Equipable by: " + weapon.getEquipableBy());
			damageLabel.setText("Damage: " +  weapon.getDamage());
			
			
		}
	};
		
	public WeaponPanel() {

		setBorder(new EmptyBorder(10, 50, 10, 50) );
		this.setSize(700, 300);
		this.setVisible(true);
		setLayout(new GridBagLayout());
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(nameLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(typeLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(equipableLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(damageLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(descriptionLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(randomButton, gbc);
		randomButton.addActionListener(rbListen);
	}

	}
