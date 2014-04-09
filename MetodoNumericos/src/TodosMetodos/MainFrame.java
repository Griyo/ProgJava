package TodosMetodos;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	PanelBotones panelBotones;
	PanelFalsaPosicion panelFalsaPosicion;
	PanelBiseccion panelBiseccion;
	
	public MainFrame(){
		super( "Metodos Numericos");
		
		panelBotones = new PanelBotones();
		panelFalsaPosicion = new PanelFalsaPosicion();
		panelBiseccion = new PanelBiseccion();
		
		add(panelBotones,BorderLayout.CENTER);
		
		//add(panelBiseccion,BorderLayout.EAST);
		add(panelFalsaPosicion,BorderLayout.EAST);
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
