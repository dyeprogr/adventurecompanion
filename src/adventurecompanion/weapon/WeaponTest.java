package adventurecompanion.weapon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WeaponTest {

	public static void main(String[] args) {
	
	final RandomWeaponGenerator rwg = new RandomWeaponGenerator();
	final Weapon weapon = rwg.createRandomWeapon();
	
	JFrame frame = new JFrame("Weapon Test");
	frame.setSize(600, 700);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
//	Toolkit tk = Toolkit.getDefaultToolkit();
//	Dimension dim = tk.getScreenSize()
	
	final JLabel nameLabel = new JLabel("Name: " + weapon.getName() + " ||");
	final JLabel typeLabel = new JLabel("Weapon Type: " +weapon.getWeaponType());
	final JLabel descriptionLabel = new JLabel("Description: " +weapon.getDescription());
	final JLabel equipableLabel = new JLabel("Equipable by: " +weapon.getEquipableBy() + "||");
	final JLabel damageLabel = new JLabel("Damage: " + weapon.getDamage());
	final JButton randomButton = new JButton("Create Random Weapon");
	
//	JTextArea weaponinfo = new JTextArea(5, 20);
////	weaponinfo.setText("Name: " + weapon.getName() + " || \n"
////			+ "Weapon Type: " +weapon.getWeaponType() + " ||" );
//	weaponinfo.setVisible(true);
//
//	JScrollPane scrollPane = new JScrollPane(weaponinfo);
	
	ActionListener rbListen = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			Weapon weapon = rwg.createRandomWeapon();
			nameLabel.setText("Name: " + weapon.getName() + " ||");
			typeLabel.setText("Weapon Type: " +weapon.getWeaponType() + " ||");
			descriptionLabel.setText("Description: " + weapon.getDescription());
			equipableLabel.setText("Equipable by: " + weapon.getEquipableBy()+ " ||");
			damageLabel.setText("Damage: " +  weapon.getDamage() + " ||" );
			
			
		}
	};

	
	randomButton.addActionListener(rbListen);

	JPanel pane = new JPanel();
	frame.add(pane);
//	pane.add(weaponLabel);
	pane.add(nameLabel);
	pane.add(typeLabel);
	pane.add(equipableLabel);
	pane.add(damageLabel);
	pane.add(descriptionLabel);
//	pane.add(weaponinfo);
	pane.add(randomButton);
	

	}
}
