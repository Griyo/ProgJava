package Calculadora;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPan extends JPanel {
	
	private JTextArea textArea;
	
	
	public TextPan() {
		textArea = new JTextArea();		
		setLayout(new BorderLayout());		
		add(textArea, BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}
