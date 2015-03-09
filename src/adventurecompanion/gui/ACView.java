package adventurecompanion.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import adventurecompanion.character.*;
import adventurecompanion.dice.*;
import adventurecompanion.weapon.*;

public class ACView extends JFrame {
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public ACView() {
		
		
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Adventurer's Companion");
		setVisible(true);
		setLayout(new GridBagLayout());
		validate();
		
		
		
		JPanel charPanel = new CharacterPanel();
		JPanel weaponPanel = new WeaponPanel();
		JPanel dicePanel = new DicePanel();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(charPanel, gbc);
		gbc.gridy = 1;
		add(weaponPanel, gbc);
		gbc.gridy = 2;
		add(dicePanel, gbc); 
		pack();
		
		
	}
}
