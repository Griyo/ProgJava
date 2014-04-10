package TodosMetodos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

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

		panelBotones.setRadioListener(new RadioListener(){
			@Override
			public void RadioPressed(JRadioButton button) {
				JRadioButton selected=(JRadioButton)button.getSelectedIcon();
				if(selected==bisButton){
					add(panelBiseccion,BorderLayout.EAST);
					}
				else{
					add(panelFalsaPosicion,BorderLayout.EAST);
				}
			}
			
		});
		
		setSize(1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
