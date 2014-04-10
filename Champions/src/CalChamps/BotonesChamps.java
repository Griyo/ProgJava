package CalChamps;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;


public class BotonesChamps extends JPanel {

	public BotonesChamps(){
		int y=0;
		int x=0;
		setLayout(null);

		for (int i=1; i<118;i++){
			
			JButton boton = new JButton();
			Dimension dim = new Dimension();
			dim.setSize(120, 120);
			boton.setSize(dim);
			ImageIcon Icon = new ImageIcon ("Botones/"+i+".png");
			boton.setIcon(Icon);
			add(boton);			
			boton.setBounds(x, y, 120, 120);
			x+=120;
			if(i%12==0){
				x=0;
				y+=120;
			}
		}			
	}
}
