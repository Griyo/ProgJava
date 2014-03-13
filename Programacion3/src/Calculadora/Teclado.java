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
	private String tempString="";
	private int i=0;
	private double resultado=0;
	String a,b;
	private boolean DivMul = false, SumRes=false;
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
			i++;
			
			for (int t=0; t<arrStr.length;t++){
				if(arrStr[t]!=null){
				System.out.println(arrStr[t]);

				}
			}
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
			tempString="";
			
		}
		
		if (clicked == btnIgual){
			arrStr[i]=tempString;
			int x=0;
					DivMul=false;
					while (DivMul==false){
						for(int y=0;y<arrStr.length;y++){
							if (arrStr[y]== "*" || arrStr[y]=="/"){
								x=y;
								DivMul=true;
							}
							
						}							
						aux=x;

					switch(arrStr[x]){
					
					case "*":
						while (arrStr[aux-1]==null){
							aux-=1;
						}
						a=arrStr[aux-1];
						aux=x;
						while (arrStr[aux+1]==null && arrStr[aux+1]!="+"){
							aux+=1;
							}
						b=arrStr[aux+1];
						Multiplicar(a,b,x);
						break;
					case "/":
						while (arrStr[aux-1]==null){
							aux-=1;
						}
						a=arrStr[aux-1];
						aux=x;
						while (arrStr[aux+1]==null && arrStr[aux+1]!="+"){
							aux+=1;
							}
						b=arrStr[aux+1];
						Division(a, b, x);
						break;
					}
					if(DivMul==true){
						arrStr[x-1]=String.valueOf(resultado);
						arrStr[x]=null;
						arrStr[x+1]=null;
					}
					}
				
				// Hasta aqui
	
					while (SumRes == true){
						for(int y=0;y<arrStr.length;y++){
							if (arrStr[y]== "+" || arrStr[y]=="-"){
								x=y;
							}
							
						}				
						for(int y=0;y<arrStr.length;y++){
						if (arrStr[y]!= "+" || arrStr[y]!="-"){
							SumRes=false;		
						}
						
					}				
	
						 aux=x;

						switch (arrStr[x]){
						case "+":
							while (arrStr[aux-1]==null){
								aux-=1;
							}
							a=arrStr[aux-1];
							aux=x;
							while (arrStr[aux+1]==null && arrStr[aux+1]!="+"){
								aux+=1;
								}
							b=arrStr[aux+1];
							Sumar(a, b, x);
							break;
						case "-":
							while (arrStr[aux-1]==null){
								aux-=1;
							}
							a=arrStr[aux-1];
							aux=x;
							while (arrStr[aux+1]==null && arrStr[aux+1]!="+"){
								aux+=1;
								}
							b=arrStr[aux+1];
							Restar(a, b, x);
							break;
						}
						arrStr[x]=String.valueOf(resultado);
						if( arrStr[x-1]!=null){
						arrStr[x-1]=null;
						}
						arrStr[x+1]=null;
					}		
			//	}
					if (SumRes==false){
						for(int y=0;y<arrStr.length;y++){
							if (arrStr[y]!=null){
								textListener.textEmitted(arrStr[y]);
							}
						}
					}
						
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



