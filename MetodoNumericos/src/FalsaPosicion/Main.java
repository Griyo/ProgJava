package FalsaPosicion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		double c1,c2,c3;
		int exp;
		double a,b,xr,fa,fb,fxr,error,eact;
		double eaux=0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dame el coeficiente del termino cuadratico");
		c1=lector.nextDouble();
		System.out.println("Dame el exponente del termino cuadratico");
		exp=lector.nextInt();
		System.out.println("Dame el coeficiente del segundo termino, si no existe, teclea '0'(Cero)");
		c2=lector.nextDouble();
		System.out.println("Dame el termino lineal,si no existe, teclea '0'(Cero)");
		c3=lector.nextDouble();
		System.out.println("Ingerse el intervalo a");
		a=lector.nextDouble();
		System.out.println("Ingerse el intervalo b");
		b=lector.nextDouble();
		System.out.println("Ingrese el error minimo deseado");
		error=lector.nextDouble();
		int cont=0;
		eact=1;
		do{
			cont++;
			fa=Funcion(exp,c1,c2,c3,a);
			fb=Funcion(exp,c1,c2,c3,b);
			xr=a-((fa*(b-a)/(fb-fa)));
			fxr=Funcion(exp,c1,c2,c3,xr);
			System.out.println(cont+" "+"fa= "+fa+" fb="+fb+" xr="+xr+" Error="+eact);
			if((fa*fxr)<0){
				b=xr;
			}
			else{
				a=xr;
			}
			eact=Math.abs((xr-eaux)/xr);
			eaux=Math.abs(xr);
			if(fxr==0){
				System.out.println("Raiz exacta es: "+xr);
				 System.exit(0); 
			}
			}while (eact>error);
		System.out.println("Ultima aproximacion encontrada: "+xr);
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