package adventurecompanion.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adventurecompanion.character.Character;
import adventurecompanion.character.RandomCharacterBuilder;

public class CharacterPanel extends JPanel {
	
//	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setSize(600, 700);
//		frame.setVisible(true);
//		frame.add(new CharacterPanel());
//		frame.setLocationRelativeTo(null);
//	}
	
	RandomCharacterBuilder rcb = new RandomCharacterBuilder();
	Character player = rcb.getRandomCharacter();
	GridBagConstraints gbc = new GridBagConstraints();
	
	final JLabel nameLabel = new JLabel("Character name: " + player.getName());
	final JLabel classLabel = new JLabel("Class: " + player.getClassName());
	final JLabel genderLabel = new JLabel("Gender: " +player.getGender() );
	final JLabel hpLabel = new JLabel(("HP : " + player.getStat("HP")));
	final JLabel strLabel = new JLabel("Str : " + player.getStat("Str"));
	final JLabel intLabel = new JLabel("Int : " + player.getStat("Int"));
	final JLabel dexLabel = new JLabel("Dex : " + player.getStat("Dex"));
	final JButton randomButton = new JButton("Create Random Character");
	
	ActionListener rbListen = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			Character player = rcb.getRandomCharacter();
			nameLabel.setText("Name: " + player.getName());
			classLabel.setText("Class: " +player.getClassName());
			genderLabel.setText("Gender: " +player.getGender());
			hpLabel.setText("HP : " + player.getStat("HP"));
			dexLabel.setText("Dex : " + player.getStat("Dex"));
			strLabel.setText("Str : " + player.getStat("Str"));
			intLabel.setText("Int : " + player.getStat("Int"));
			
		}
	};
		
	public CharacterPanel() {
		this.setSize(700, 300);
		this.setVisible(true);
		setLayout(new GridBagLayout());
		setBorder(new EmptyBorder(10, 10, 10, 10) );
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(nameLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(classLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(genderLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(strLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(intLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(dexLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(hpLabel, gbc);
		gbc.gridy = 7;
		add(randomButton, gbc);
		randomButton.addActionListener(rbListen);
	}


}
