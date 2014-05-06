package Pilas.Colas;
import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {
	        // TODO code application logic here
	        Grafo g=new Grafo();
	        ArrayList<Integer> enAnchura=g.recorridoAnchura(0);//Nodo inicial 0
	        System.out.println("Recorrido en anchura de un grafo representado como matriz: ");
	        for(int i=0;i<enAnchura.size();i++){
	            System.out.print(""+enAnchura.get(i)+" ");
	        }
	        ArrayList<Integer> enProfundidad=g.recorridoProfunidad(0);//Nodo inicial 0
	        System.out.println("");
	        System.out.println("Recorrido en profundidad de un grafo representado como matriz: ");
	        for(int i=0;i<enProfundidad.size();i++){
	            System.out.print(""+enProfundidad.get(i)+" ");
	        }
	    }
}
