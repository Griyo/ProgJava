package Ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TecladoCalculadora extends JPanel {
	
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPunto,btnIgual,btnSuma,btnResta,btnDivision,btnMulti;
	TextPanel panel;
	
	public TecladoCalculadora(TextPanel panel){

		this.panel=panel;
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
			TecladoCalculadora.this.panel.escribir("1");			
			}
		});
		
		this.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("2");			
			}
		});
		this.add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("3");			
			}
		});
		this.add(btnSuma);
		
		btnSuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		this.add(btn4);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("4");			
			}
		});
		this.add(btn5);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("5");			
			}
		});
		this.add(btn6);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("6");			
			}
		});
		this.add(btnResta);
		this.add(btn7);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("7");			
			}
		});
		this.add(btn8);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("8");			
			}
		});
		this.add(btn9);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("9");			
			}
		});
		this.add(btnDivision);
		this.add(btn0);
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir("0");			
			}
		});
		this.add(btnPunto);
		btnPunto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TecladoCalculadora.this.panel.escribir(".");			
			}
		});
		this.add(btnIgual);
		this.add(btnMulti);
	}
}
