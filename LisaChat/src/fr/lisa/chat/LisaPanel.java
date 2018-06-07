package fr.lisa.chat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LisaPanel extends JPanel implements ActionListener{
	

		
	private JTextField usernameField = new JTextField("Emplacement texte");
	
	
	
	
	public LisaPanel() {
		
		this.setLayout(null);
	 		
		usernameField.setFont(usernameField.getFont().deriveFont(20F));
		usernameField.setBounds(0,0,975,50);
		//usernameField.setBackground(new Color(80,68,70));
		//usernameField.setForeground(Color.WHITE);
		//usernameField.setBorder(BorderFactory.createLineBorder(new Color(64,52,53)));
		this.add(usernameField);
		
		
	}
	

	
	
	
	public void actionPerformed(ActionEvent evt) {
       

		
		

		
	}
	
	


	
	
}