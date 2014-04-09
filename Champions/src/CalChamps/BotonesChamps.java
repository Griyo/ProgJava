package CalChamps;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;


public class BotonesChamps extends JPanel {

	public BotonesChamps(){
		
		setLayout(new GridLayout(20,6,2,2));

		for (int i=0; i<117;i++){
			
			JButton boton = new JButton();
			ImageIcon Icon = new ImageIcon ("Botones/"+i+".png");
			boton.setIcon(Icon);
			Dimension dim = new Dimension();
			dim.setSize(120, 120);
			boton.setSize(dim);
			add(boton);			
		}	
		
		
		
	}
}
