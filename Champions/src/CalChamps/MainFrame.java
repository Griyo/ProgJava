package CalChamps;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	BotonesChamps PanelBotones;
	public MainFrame(){
		super ("Calculadora de Estadisticas");
		
		PanelBotones= new BotonesChamps();
		
		add(PanelBotones,BorderLayout.WEST);
		
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

}
