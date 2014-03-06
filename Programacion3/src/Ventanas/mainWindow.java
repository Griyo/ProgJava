package Ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {
	
	
	private int altura=0, ancho=0;
	private String titulo ="";

	JPanel pantalla,teclado;
	
	public MainWindow (String titulo, int ancho, int altura){
		
		TextPanel panel=new TextPanel();
		this.setTitle(titulo);
		this.setSize(ancho, altura);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel,BorderLayout.NORTH);
		this.add(new TecladoCalculadora(panel),BorderLayout.CENTER);
		this.setVisible(true);
	}

	public MainWindow (){
		this.setTitle("Griyo's Windows");
		this.setSize(200, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,4,5,5));
		this.setVisible(true);
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
