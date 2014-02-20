package Ventanas;

import javax.swing.JFrame;

public class mainWindow extends JFrame {
	
	public mainWindow (){
		this.setTitle("Griyo's Windows");
		this.setSize(400, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
