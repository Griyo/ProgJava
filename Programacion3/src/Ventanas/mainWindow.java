package Ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	
	private int altura=0, ancho=0;
	private String titulo ="";
	
	JButton btn;
	
	public MainWindow (String titulo, int ancho, int altura){
		this.setTitle(titulo);
		this.setSize(ancho, altura);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton ("Hola Mundo Grafico!");
		add(btn);
		this.setVisible(true);
	}

	public MainWindow (){
		this.setTitle("Griyo's Windows");
		this.setSize(200, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton ("Hola Mundo Grafico!");
		add(btn);
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
