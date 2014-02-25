package Ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class TecladoCalculadora extends JButton {
	
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPunto,btnIgual,btnSuma,btnResta,btnDivision,btnMulti;
	TextPanel panel;
	
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
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			panel.escribir("1");			
			}
		});
		
		this.add(btn2);
		this.add(btn3);
		this.add(btnSuma);
		
		btnSuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
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
}
