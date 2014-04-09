package TodosMetodos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelBiseccion extends JPanel {
	
	double c1,c2,c3,x;
	int exp,cont;
	double a,b,ia,ib,m,fa,fb,fm,error,eact;
	double eaux=0;
	Scanner lector = new Scanner(System.in);
	
	JTextArea textArea;
	JTextField c1Field,c2Field,c3Field,expField,aField,bField,errorField;
	JLabel c1Label,c2Label,c3Label,expLabel,aLabel,bLabel,errorLabel;
	JButton ejecutar;
	
	public PanelBiseccion(){
		
		c1Field = new JTextField(5);
		c2Field = new JTextField(5);
		expField= new JTextField(5);
		c3Field = new JTextField(5);
		aField = new JTextField(5);
		bField = new JTextField(5);
		errorField = new JTextField(5);


		
		c1Label = new JLabel("Coeficiente del termino cuadratico");
		expLabel = new JLabel("Exponente del termino cuadratico");
		c2Label = new JLabel("Coeficiente del termino lineal");
		c3Label = new JLabel("Termino independiente");
		aLabel= new JLabel("Intervalo A");
		bLabel= new JLabel("Intervalo B");
		errorLabel= new JLabel("Error deseado");
		
		textArea= new JTextArea();

		setLayout(new GridLayout(8,3,0,0));
		add(c1Label);add(c1Field);
		add(expLabel);add(expField);
		add(c2Label);add(c2Field);
		add(c3Label);add(c3Field);
		add(aLabel);add(aField);
		add(bLabel);add(bField);
		add(errorLabel);add(errorField);
		
		ejecutar = new JButton("Ejecutar");
		textArea.setEditable(false);
		add(ejecutar);add(textArea);

		ejecutar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				c1=Double.parseDouble(c1Field.getText());
				exp=Integer.parseInt(expField.getText());
				c2=Double.parseDouble(c2Field.getText());
				c3=Double.parseDouble(c3Field.getText());
				a=Double.parseDouble(aField.getText());
				b=Double.parseDouble(bField.getText());
				error=Double.parseDouble(errorField.getText());
				
				do{
					cont++;
					m=(a+b)/2;
					fa=Funcion(exp,c1,c2,c3,a);
					fb=Funcion(exp,c1,c2,c3,b);
					fm=Funcion(exp,c1,c2,c3,m);
					if((fa*fm)<0){
						b=m;
					}
					else{
						a=m;
					}
					eact=Math.abs((m-eaux)/m);
					eaux=Math.abs(m);
					if(fm==0){
						System.out.println("La ultima aproximacion fue: "+m);
						System.out.println("Numero de iteraciones: "+cont);
						 System.exit(0); 
					}
					}while (eact>error);
				textArea.append("La ultima aproximacion fue: "+m+"\n");
				textArea.append("Numero de iteraciones: "+cont);
			}
			
		});
		
	}
	
	public static double Funcion(int exp, double c1, double c2, double c3, double x){
		double total=c1;
		c2=c2*x;
		total=((double)Math.pow(x, exp)*c1);
		if (c2<0){
			c2*=-1;
			total-=c2;
		}
		else{
			total+=c2;	
		}
		if (c3<0){
			c3*=-1;
			total-=c3;
		}
		else{
			total+=c3;	
		}
		return total; 
	}

}
