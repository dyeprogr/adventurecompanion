package adventurecompanion.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adventurecompanion.dice.DiceManager;

public class DicePanel extends JPanel {

	DiceManager dm = DiceManager.getInstance();
	GridBagConstraints gbc = new GridBagConstraints();
	
	JButton die1 = new JButton((String.valueOf(dm.getFace(1))));
	JButton die2 = new JButton(((String.valueOf(dm.getFace(2)))));
	JButton die3 = new JButton(((String.valueOf(dm.getFace(3)))));
	JLabel sum = new JLabel(dm.getSum());
	JButton allRoll = new JButton("Roll All");
	
	
	// These button listeners will roll each individual die and 
	// update the sum value with the new sum
	ActionListener dieListener1 = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			dm.rollDie(1);
			die1.setText(((String.valueOf(dm.getFace(1)))));
			sum.setText(dm.getSum());
		}
	};
	ActionListener dieListener2 = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dm.rollDie(2);
				die2.setText(((String.valueOf(dm.getFace(2)))));
				sum.setText(dm.getSum());
			}
	};
	ActionListener dieListener3 = new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					dm.rollDie(3);
					die3.setText(((String.valueOf(dm.getFace(3)))));
					sum.setText(dm.getSum());
				}	
	};
	ActionListener rollAllListener = new ActionListener() { 
		
			public void actionPerformed(ActionEvent e) {
				dm.rollAll();
				die1.setText(((String.valueOf(dm.getFace(1)))));
				die2.setText(((String.valueOf(dm.getFace(2)))));
				die3.setText(((String.valueOf(dm.getFace(3)))));
				sum.setText(dm.getSum());
			}
	};
	
	public DicePanel() {
		
		setBorder(new EmptyBorder(10, 10, 10, 10) );
		this.setSize(700, 300);
		this.setVisible(true);
		setLayout(new GridBagLayout());
		
		gbc.insets = new Insets(5,5,5,5);
		
		die1.addActionListener(dieListener1);
		die2.addActionListener(dieListener2);
		die3.addActionListener(dieListener3);
		allRoll.addActionListener(rollAllListener);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(die1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(die2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(die3, gbc);
		gbc.gridy = 0;
		gbc.gridx = 3;
		gbc.gridwidth = 2;
		add(sum, gbc);
		gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(allRoll, gbc);
		
		
		
		
	}
}
