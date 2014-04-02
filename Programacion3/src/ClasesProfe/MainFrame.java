package ClasesProfe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	private ArrayList<FormEvent> lista;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		lista = new ArrayList<FormEvent>();
		btn = new JButton("Click me");
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		toolbar = new Toolbar();
		
		
		toolbar.setArrayList(lista);
		toolbar.setStringListener(new StringListener(){

			@Override
			public void textEmitted(String text) {
				// TODO Auto-generated method stub
				textPanel.appendText(text);
			}});
		
		toolbar.setArrayListener(new ArrayListener(){
			
			@Override
			public void ArrayEmitted(ArrayList<FormEvent> lista) {
				// TODO Auto-generated method stub
				for(FormEvent fe:lista){
					textPanel.appendText(fe.getName()+": "+fe.getOccupation()+". "+fe.getEdad()+" Años"+"\n");
					}
				
			}
			
		});
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("Hello\n");
			}
		});
		
		formPanel.setFormListener(new FormListener(){			
			public void formEventOcurred(FormEvent e){
				
				lista.add(e);
			//	String name = e.getName();
			//	String occupation = e.getOccupation();
			//	textPanel.appendText(name + ": "+occupation + "\n");				
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(formPanel,BorderLayout.WEST);
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
