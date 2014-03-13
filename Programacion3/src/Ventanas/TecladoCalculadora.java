package Ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ClasesProfe.StringListener;

public class TecladoCalculadora extends JPanel implements ActionListener {
	
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPunto,btnIgual,btnSuma,btnResta,btnDivision,btnMulti;
	TextPanel panel;
	private StrLis textListener;

	
	public TecladoCalculadora(){

		setLayout(new GridLayout(4,4,5,5));
		btn1=new JButton("1");		
		btn2=new JButton("2");
		btn3=new JButton("3");
		btnSuma=new JButton("+");
		btn4=new JButton("4");
		btn5=new JButton("5");
		btn6=new JButton("6");
		btnResta=new JButton("-");
		btn7=new JButton("7");
		btn8=new JButton("8");
		btn9=new JButton("9");
		btnDivision=new JButton("/");
		btn0=new JButton("0");
		btnPunto=new JButton(".");
		btnIgual=new JButton("=");
		btnMulti=new JButton("*");

		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btnSuma);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btnResta);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		this.add(btnDivision);
		this.add(btn0);
		this.add(btnPunto);
		this.add(btnIgual);
		this.add(btnMulti);
	}

	public void setStrLis(StrLis Listen){
		this.textListener = Listen;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		JButton clicked =  (JButton) e.getSource();
		if(clicked == btn1){
			//textPanel.appendText("Hello!\n");
			if (textListener != null){
				textListener.textEmitted("1\n");
			}
		}
		else {
			//textPanel.appendText("Goodbye!\n");
			if (textListener != null){
				textListener.textEmitted("Goodbye\n");
			}
		}
			
	}
}
