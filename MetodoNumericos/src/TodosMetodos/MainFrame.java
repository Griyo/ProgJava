package TodosMetodos;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
	
	PanelBotones panelBotones;
	PanelFalsaPosicion panelFalsaPosicion;
	PanelBiseccion panelBiseccion;
	JButton Selected;
	
	public MainFrame(){
		super( "Metodos Numericos" );
		
		panelBotones = new PanelBotones();
		panelFalsaPosicion = new PanelFalsaPosicion();
		panelBiseccion = new PanelBiseccion();
				
		add(panelBotones,BorderLayout.CENTER);	
		add(panelBiseccion,BorderLayout.EAST);		
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
}
