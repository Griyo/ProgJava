package Pilas.Colas;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grafox=5;
		int grafoy=5;
		 int grafo[][] = new int[grafox][grafoy];
		 
		 for (int i=0;i<grafox;i++){
			 for (int j=0;j<grafoy;j++){
				 grafo[i][j]=0;
			 }
		 }
		 
		 grafo[0][2]=1;
		 grafo[0][1]=1;
		 grafo[1][0]=1;
		 grafo[1][3]=1;
		 grafo[2][0]=1;
		 grafo[2][4]=1;
		 grafo[3][1]=1;
		 grafo[4][2]=1;

		 
		 
		 for (int i=0;i<grafox;i++){
			 for (int j=0;j<grafoy;j++){
				 if (grafo[i][j]!=0){
					System.out.print(grafo[i][j]+" ");	
				 }
				 else{
					 System.out.print("-"+" ");
				 }
			 }
			 System.out.println("\n");
		 }
		 
		 
		 


		Stack pila = new Stack();
		
		
		
		
	}	
	

	
}
