package TodosMetodos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	MainFrame prueba;
	private ButtonGroup buttonGroup;	

	
	public PanelBotones(){
	
		Border innerBorder = BorderFactory.createTitledBorder("Seleccion de metodos");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		bisRadioButton = new JRadioButton("Biseccion");
		falPosRadioButton = new JRadioButton("Falsa Posicion");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(bisRadioButton);
		buttonGroup.add(falPosRadioButton);
		bisRadioButton.setSelected(true);
		

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
}	

	

