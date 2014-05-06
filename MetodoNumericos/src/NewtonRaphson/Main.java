package NewtonRaphson;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		double c1,c2,c3;
		int exp,ppt;
		double a,b,xr,fa,fb,error,fd,epsilon;
		double eaux=0;
		double cpt,cst;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dame el coeficiente del termino cuadratico");
		c1=1;
		System.out.println("Dame el exponente del termino cuadratico");
		exp=3;
		System.out.println("Dame el coeficiente del segundo termino, si no existe, teclea '0'(Cero)");
		c2=-5;
		System.out.println("Dame el termino lineal,si no existe, teclea '0'(Cero)");
		c3=1;
		System.out.println("Ingerse el intervalo a");
		a=0;
		System.out.println("Ingerse el intervalo b");
		b=1;
		System.out.println("Ingrese el error minimo deseado");
		epsilon=0.001;
		System.out.println("Dame el coeficiente de la derivada del primer termino");
		cpt=3;
		System.out.println("Dame el exponente de la derivada del primer termino");
		ppt=2;
		System.out.println("Dame el Coeficiente del segundo termino");
		cst=-5;
		int cont=1;
		
		fa=Funcion(exp, c1, c2, c3, b);
		fb=Funcion(exp, c1, c2, c3, a);
		fd=FuncionDerivada(ppt, cpt, cst,b);
		
		if (fa*fb<0 && fd!=0 ){
			eaux=b;
			do{
				cont++;
				fa=Funcion(exp, c1, c2, c3, b);
				fd=FuncionDerivada(ppt, cpt, cst, b);
				eaux=b;
				b=b-(fa/fd);  								//Aproximacion
				error=(b-eaux);
				error/=b;									//Calculo de Error
				System.out.println(error+">:("+epsilon);
				}while (error>epsilon);
			System.out.println("Ultima aproximacion encontrada: "+b);
			System.out.println("Iteraciones: "+cont);
		}
	}
	
	public static double FuncionDerivada(int ppt,double cpt,double cst, double b){
		double totald=0.0,totalaux;
		totald=cpt*(Math.pow(b, ppt));
		totalaux=totald+(cst);		
		return totalaux;
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