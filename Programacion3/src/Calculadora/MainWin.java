package Calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ClasesProfe.StringListener;
import Ventanas.TecladoCalculadora;
import Ventanas.TextPanel;

public class MainWin extends JFrame {
	
	private Teclado teclado;
	private TextPan textPanel;
	
	public MainWin(){
		super ("Griyo's Calculator");
		
		setLayout(new BorderLayout());
			
		teclado = new Teclado();
		textPanel=new TextPan();
		
		teclado.setStrLis(new StrLis() {
			@Override
			public void textEmitted(String text) {
				// TODO Auto-generated method stub
				textPanel.appendText(text);
			}});

		add(teclado, BorderLayout.CENTER);
		add(textPanel, BorderLayout.NORTH);
		
		setSize(300	, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	

	}
	
}
