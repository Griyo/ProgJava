package Calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Teclado extends JPanel implements ActionListener,Operaciones  {
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPunto,btnIgual,btnSuma,btnResta,btnDivision,btnMulti;
	private StrLis textListener;
	private String tempString="",limpiar="";
	private int i=0,x=0,y=0;
	private double resultado=0;
	String a,b;
	int aux=0;
	
	String arrStr[] = new String [10];
	
	public Teclado(){

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

		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnSuma.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnResta.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnDivision.addActionListener(this);
		btn0.addActionListener(this);
		btnPunto.addActionListener(this);
		btnIgual.addActionListener(this);
		btnMulti.addActionListener(this);
		
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

	public void setStrLis(StrLis Listener){
		this.textListener = Listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked =  (JButton) e.getSource();
		if(clicked == btn1){
			if (textListener != null){
				textListener.textEmitted("1");
				tempString+=1;
			}
		}
		if(clicked == btn2){
			if (textListener != null){
				textListener.textEmitted("2");
				tempString+=2;
			}
		}
		if(clicked == btn3){
			if (textListener != null){
				textListener.textEmitted("3");
				tempString+=3;
			}
		}
		if(clicked == btn4){
			if (textListener != null){
				textListener.textEmitted("4");
				tempString+=4;
			}
		}
		if(clicked == btn5){
			if (textListener != null){
				textListener.textEmitted("5");
				tempString+=5;
			}
		}
		if(clicked == btn6){
			if (textListener != null){
				textListener.textEmitted("6");
				tempString+=6;
			}
		}
		if(clicked == btn7){
			if (textListener != null){
				textListener.textEmitted("7");
				tempString+=7;
			}
		}
		if(clicked == btn8){
			if (textListener != null){
				textListener.textEmitted("8");
				tempString+=8;
			}
		}
		if(clicked == btn9){
			if (textListener != null){
				textListener.textEmitted("9");
				tempString+=9;
			}
		}
		if(clicked == btn0){
			if (textListener != null){
				textListener.textEmitted("0");
				tempString+=0;
			}
		}
		
		if (clicked == btnMulti || clicked == btnDivision || clicked == btnResta || clicked == btnSuma){
			
			arrStr[i]=tempString;
			tempString=limpiar;
			i++;

			if(clicked == btnMulti){
				arrStr[i]="*";
			}
			if(clicked == btnDivision){
				arrStr[i]="/";
			}			
			if(clicked == btnResta){
				arrStr[i]="-";
			}			
			if(clicked == btnSuma){
				arrStr[i]="+";
			}
			i++;
			textListener.textEmitted(arrStr[i-1]);			
		}
		
		if (clicked == btnIgual){			
			arrStr[i]=tempString;
			
			while(y!=10){
			 x=0;
			 y=0;
			
			while (x==0 && y<10){
				if (arrStr[y]=="*" || arrStr[y]=="/"){
					x=y;
				}
				y++;
			}			
			if(x!=0){
				switch(arrStr[x]){
				
				case "*":
					aux=x;
					a=arrStr[aux-1];					
					b=arrStr[aux+1];
					Multiplicar(a,b,x);
					break;
				case "/":
					aux=x;
					a=arrStr[aux-1];
					b=arrStr[aux+1];
					Division(a, b, x);
					break;
				}				
				arrStr[x]=null;
				arrStr[x+1]=null;
				
					while (x+2<arrStr.length){
					arrStr[x]=arrStr[x+2];
					arrStr[x+2]=null;
					x++;
				}
			}
		}
			
			y=0;
			while(y!=10){
			x=0;
			y=0;
			
			while (x==0 && y<10){
				if (arrStr[y]=="+" || arrStr[y]=="-"){
					x=y;
				}
				y++;
			}			
			if(x!=0){
				switch(arrStr[x]){
				
				case "+":
					aux=x;
					a=arrStr[aux-1];					
					b=arrStr[aux+1];
					Sumar(a,b,x);
					break;
				case "-":
					aux=x;
					a=arrStr[aux-1];
					b=arrStr[aux+1];
					Restar(a, b, x);
					break;
				}				
				arrStr[x]=null;
				arrStr[x+1]=null;				
				while (x+2<arrStr.length){
				arrStr[x]=arrStr[x+2];
				arrStr[x+2]=null;
				x++;
			}
			}
		}
		textListener.textEmitted("  =  "+arrStr[0]);
		}
	}	

	@Override
	public void Sumar(String a, String b, int x) {
		resultado = Double.parseDouble(a)+Double.parseDouble(b);
		arrStr[x-1]=String.valueOf(resultado);		
	}

	@Override
	public void Restar(String a, String b, int x) {
		resultado = Double.parseDouble(a)-Double.parseDouble(b);
		arrStr[x-1]=String.valueOf(resultado);		
	}

	@Override
	public void Multiplicar(String a, String b, int x) {
		// TODO Auto-generated method stub
		resultado = Double.parseDouble(a)*Double.parseDouble(b);
		arrStr[x-1]=String.valueOf(resultado);
	}

	@Override
	public void Division(String a, String b, int x) {
		resultado = Double.parseDouble(a)/Double.parseDouble(b);
		arrStr[x-1]=String.valueOf(resultado);		
	}
}



