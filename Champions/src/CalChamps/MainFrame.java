package CalChamps;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	BotonesChamps PanelBotones;
	PanelCalculator PanelCalculator;
	JScrollPane scroller;

	public MainFrame(){
		super ("Calculadora de Estadisticas");
		
		PanelBotones= new BotonesChamps();
		PanelCalculator = new PanelCalculator();
		
		add(PanelBotones);
		
		this.setResizable(false);
		setSize(1245, 850);
		 //add(PanelCalculator,BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
