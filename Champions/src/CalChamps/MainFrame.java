package CalChamps;

import java.awt.BorderLayout;
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
		
		scroller = new JScrollPane(PanelBotones);
		add(scroller,BorderLayout.CENTER);
		//add(PanelCalculator,BorderLayout.CENTER);
		
		
		setSize(1215, 717);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

}
