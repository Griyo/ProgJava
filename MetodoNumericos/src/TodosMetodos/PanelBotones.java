package TodosMetodos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelBotones extends JPanel {
	
	JRadioButton bisRadioButton,falPosRadioButton;
	JTextField c1TextField;
	private ButtonGroup buttonGroup;	
	private RadioListener butListener;

	
	public PanelBotones(){
		
		
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Insercion de datos");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		bisRadioButton = new JRadioButton("Biseccion");
		falPosRadioButton = new JRadioButton("Falsa Posicion");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(bisRadioButton);
		buttonGroup.add(falPosRadioButton);
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 0;
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(bisRadioButton,gc);
		gc.gridy++;
		add(falPosRadioButton,gc);		
	}
	
	public void setRadioListener(RadioListener Listener){
		this.butListener=Listener;
	}
	
	public double biseccion(double c1, double c2, double c3, double x, int exp, double a,
			double b, double ia, double ib, double m, double fa, double fb, double fm,
			double error, double eact, double eaux){
		
		
		
		double total=0;
		
		
		return total;
		
	}
}
