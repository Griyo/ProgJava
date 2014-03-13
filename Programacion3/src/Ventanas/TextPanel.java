package Ventanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextPanel extends JPanel {

	private JTextField textArea;
	private JButton btn;
	

	public TextPanel(){
		setLayout(new BorderLayout());

		textArea= new JTextField();
		add(new JScrollPane(textArea), BorderLayout.NORTH);
	}
	
	public void appendText (String cadena){
		textArea.setText(textArea.getText()+cadena);
	}
}
