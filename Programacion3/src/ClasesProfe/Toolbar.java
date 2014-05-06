package ClasesProfe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton goodbyeButton,helloButton,mostrarInfo,actButton,delButton;	
	
	private StringListener textListener;
	private ArrayListener arrayListener;
	private ArrayList<FormEvent> myList;
	private ArrayList<FormEvent> dbList;

	DatabaseLayer dbl;
	
	public Toolbar() {
	goodbyeButton = new JButton("Goodbye");
	helloButton = new JButton("Hello!");
	mostrarInfo = new JButton ("Desplegar");
	actButton = new JButton("Actualizar");
	delButton = new JButton("Borrar");
	
	helloButton.addActionListener(this);
	goodbyeButton.addActionListener(this);
	mostrarInfo.addActionListener(this);
	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	
	add(mostrarInfo);
	add(helloButton);
	add(goodbyeButton);
	}
	
	public void setStringListener(StringListener Listener){
	this.textListener = Listener;
	}
	
	public void setArrayList(ArrayList<FormEvent> lista){
		this.myList=lista;
	}
	public void setArrayListener(ArrayListener Listener){
		this.arrayListener=Listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton) e.getSource();
	
		if (clicked == mostrarInfo){			
				if(arrayListener!=null)
				arrayListener.ArrayEmitted(this.myList);
			}
		if(clicked == goodbyeButton){
			if (textListener != null){
			textListener.textEmitted("Goodbye!\n");
			}
		}
		if(clicked == helloButton) {
			if (textListener != null){
			textListener.textEmitted("Hello!\n");
			}
		}
		if(clicked == delButton){
			
		}
		if(clicked == actButton){
			
		}
	}
}


