package Arboles;
import javax.swing.JOptionPane;
 
public class PruebaArbol
{
    public static void main(String args [])
    {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;
         
        System.out.println("Insertando los siguientes valores: ");
         
        Dato = JOptionPane.showInputDialog("Inserta el numero de nodos que desea ingresar");
        int n = Integer.parseInt(Dato);
         
        for(int i = 1; i <= n; i++ )
        {
            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Arbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }
         
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();
         
        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();
         
        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }
}
