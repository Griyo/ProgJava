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
		//btn = new JButton("=");
		
		/*btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hola \n");
				System.out.println(e);
			}
		});*/
		textArea= new JTextField();
		//add(btn, BorderLayout.SOUTH);
		add(new JScrollPane(textArea), BorderLayout.NORTH);
	}
	
	public void escribir (String cadena){
		textArea.setText(textArea.getText()+cadena);
	}
}
